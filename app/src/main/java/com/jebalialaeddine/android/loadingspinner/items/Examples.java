package com.jebalialaeddine.android.loadingspinner.items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aej on 22/01/2015.
 */
public class Examples {

    public static List<ExampleItem> ITEMS = new ArrayList<ExampleItem>();
    public static Map<String, ExampleItem> ITEM_MAP = new HashMap<String, ExampleItem>();

    static {
        addItem(new ExampleItem("1", "01 - ProgressDialog"));
        addItem(new ExampleItem("2", "02 - Example 2"));
        addItem(new ExampleItem("3", "03 - Example 3"));
    }

    private static void addItem(ExampleItem exampleItem) {
        ITEMS.add(exampleItem);
        ITEM_MAP.put(exampleItem.id, exampleItem);
    }

    public static class ExampleItem {
        public String id;
        public String content;

        public ExampleItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
