package com.jebalialaeddine.android.loadingspinner.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.jebalialaeddine.android.loadingspinner.R;
import com.jebalialaeddine.android.loadingspinner.ui.fragment.LoadingSpinnerListFragment;


/**
 * An activity representing a list of LoadingSpinners. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link com.jebalialaeddine.android.loadingspinner.ui.fragment.LoadingSpinnerListFragment} and the item details
 * (if present) is a {@link com.jebalialaeddine.android.loadingspinner.ui.fragment.LoadingSpinnerDetailFragment}.
 * <p/>
 * This activity also implements the required
 * {@link com.jebalialaeddine.android.loadingspinner.ui.fragment.LoadingSpinnerListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class LoadingSpinnerListActivity extends FragmentActivity
        implements LoadingSpinnerListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    public static String TAG = "listActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingspinner_list);

        if (findViewById(R.id.loadingspinner_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the 'activated' state when touched.
            ((LoadingSpinnerListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.loadingspinner_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }

    /**
     * Callback method from {@link LoadingSpinnerListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        Log.w(TAG, "LoadingSpinnerListActivity.onItemSelected: " + id);
        switch (id){
            case "1":
                Log.i(TAG, "onItemSelected(1), show 01 - ProgressDialog Fragment");
                Intent progressDialogIntent = new Intent(this, ProgressDialogActivity.class);
                startActivity(progressDialogIntent);
                break;
            case "2":
                Log.i(TAG, "onItemSelected(2)");
                break;
            case "3":
                Log.i(TAG, "onItemSelected(3)");
                break;
        }
    }
}
