package com.jebalialaeddine.android.loadingspinner.ui.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.jebalialaeddine.android.loadingspinner.R;
import com.jebalialaeddine.android.loadingspinner.ui.fragment.LoadingSpinnerDetailFragment;
import com.jebalialaeddine.android.loadingspinner.ui.fragment.ProgressDialogFragment;

public class ProgressDialogActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_progress_dialog);

        setContentView(R.layout.activity_loadingspinner_detail);

        // Show the Up button in the action bar.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString(LoadingSpinnerDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(LoadingSpinnerDetailFragment.ARG_ITEM_ID));
            //LoadingSpinnerDetailFragment fragment = new LoadingSpinnerDetailFragment();
            ProgressDialogFragment fragment = new ProgressDialogFragment();

            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_progress_dialog, fragment)
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_progress_dialog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
