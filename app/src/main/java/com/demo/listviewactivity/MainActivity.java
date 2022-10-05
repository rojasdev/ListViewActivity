package com.demo.listviewactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    TextView selection;
    String[] items={"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 8","Item 9","Item 10","Item 11","Item 12"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items));
        selection=(TextView) findViewById(R.id.selection);

    }
    public void onListItemClick(ListView parent, View v, int position, long id)  {
        selection.setText(items[position]);
        Toast.makeText(this, "Item Position " + position, Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","Item Position " + position + " ,Desc " + items[position]);
    }
}