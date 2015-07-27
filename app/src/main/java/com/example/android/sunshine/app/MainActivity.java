package com.example.android.sunshine.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        private ArrayAdapter<String> arrayAdapter;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Today - Sunny - 88/63");
            arrayList.add("Today - Rainy - 88/63");
            arrayList.add("Today - Whizzly - 88/63");
            arrayList.add("Today - Whizzly - 88/63");
            arrayList.add("Today - Whizzly - 88/63");
            arrayList.add("Tommorrow - Whizzly - 88/63");
            arrayList.add("Always - Whizzly - 88/63");
            arrayList.add("Never - Whizzly - 88/63");
            arrayList.add("Sometimes - Whizzly - 88/63");
            arrayList.add("Yesterday - Whizzly - 88/63");
            arrayList.add("Grary - Whizzly - 88/63");
            arrayList.add("Today1 - Whizzly - 88/63");
            arrayList.add("Today2 - Whizzly - 88/63");
            arrayList.add("Today3 - Whizzly - 88/63");

            arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast,R.id.list_item_forecast_textview,arrayList);
            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(arrayAdapter);

            return rootView;
        }
    }
}
