package com.takeoffandroid.multipleviewinrecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class HeaderRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_recyclerview);

        RecyclerView recyclerView = (RecyclerView) findViewById (R.id.my_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager (this);
        HeaderAdapter adapter = new HeaderAdapter(HeaderRecyclerActivity.this, getListItems ());
        recyclerView.setLayoutManager (linearLayoutManager);
        recyclerView.setAdapter (adapter);
    }


    public ArrayList<Generic> getListItems () {
        ArrayList<Generic> generics = new ArrayList<Generic> ();
        for (int i = 0; i < 10; i++) {
            Generic item = new Generic ();
            item.setName ("list item" + i);
            generics.add (item);
        }
        return generics;
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ().inflate (R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ();

        //noinspection SimplifiableIfStatement
        if(id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected (item);
    }
}
