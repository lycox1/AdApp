package com.e4deen.adapp;

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
import android.widget.ListView;

import com.e4deen.adapp.listview.ListViewAdapterForNavView;
import com.e4deen.adapp.listview.ListViewAdapterForMainView;

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
        ListViewAdapterForNavView adapter2;

        adapter2 = new ListViewAdapterForNavView();

        listview2 = (ListView) findViewById(R.id.listview_nav);

        listview2.setAdapter(adapter2);

        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.cart),
                "취미/도서/티켓", ContextCompat.getDrawable(this, R.drawable.double_arrow_right)) ;
        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.coffee),
                "가구/생활/주방/식품", ContextCompat.getDrawable(this, R.drawable.double_arrow_right));
        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.letter),
                "출산/육아 등", ContextCompat.getDrawable(this, R.drawable.double_arrow_right));
        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.noodle),
                "가전/디지털/컴퓨터", ContextCompat.getDrawable(this, R.drawable.double_arrow_right));
        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.cart),
                "패션/뷰티", ContextCompat.getDrawable(this, R.drawable.double_arrow_right));
        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.coffee),
                "스포츠/레저용품", ContextCompat.getDrawable(this, R.drawable.double_arrow_right));
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
