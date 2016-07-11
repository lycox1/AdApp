package com.e4deen.adapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    final String LOG_TAG = "e4deen_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//---------------------------------------- Start ---------------------------------------------------
        ListView listview;
        ListViewAdapterForMainView adapter;

        adapter = new ListViewAdapterForMainView();

        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        //adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_account_box_black_36dp),
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pic1),
                "Box", "Account Box Black 36dp") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pic2),
                "Circle", "Account Circle Black 36dp");
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pic3),
                "Ind", "Assignment Ind Black 36dp");

//        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pic4),
//                "Ind", "Assignment Ind Black 36dp");
//---------------------------------------- End -----------------------------------------------------
//---------------------------------------- Start 2 -------------------------------------------------
        ListView listview2;
        //ListViewAdapterForMainView adapter;

        ArrayList<String> menuList = new ArrayList<String>();
        menuList.add("Test Menu 1");
        menuList.add("Test Menu 2");
        menuList.add("Test Menu 3");
        menuList.add("Test Menu 4");
        menuList.add("Test Menu 5");
        menuList.add("Test Menu 6");
        menuList.add("Test Menu 7");
        menuList.add("Test Menu 8");
        menuList.add("Test Menu 9");
        menuList.add("Test Menu 10");
        menuList.add("Test Menu 10");
        menuList.add("Test Menu 10");
        menuList.add("Test Menu 10");
        menuList.add("Test Menu 10");
        menuList.add("Test Menu 10");
        menuList.add("Test Menu 10");

        //adapter = new ListViewAdapterForMainView();

        ArrayAdapter<String> adapter2;
        adapter2 = new ArrayAdapter<String>(this, R.layout.listview_for_navigation_view, menuList);
        listview2 = (ListView) findViewById(R.id.listview2);

        if(adapter2 == null)
            Log.e(LOG_TAG, "adapter2 is null");
        if ( listview2 == null)
            Log.e(LOG_TAG, "listview2 is null");

        listview2.setAdapter(adapter2);

        listview2.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listview2.setDivider(new ColorDrawable(Color.WHITE));
        listview2.setDividerHeight(2);
//---------------------------------------- End -----------------------------------------------------



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camara) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
