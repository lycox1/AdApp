package com.e4deen.adapplication;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        getSupportActionBar().hide();

        ListView listview;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();

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

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pic4),
                "Ind", "Assignment Ind Black 36dp");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                //get item
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position);

                    String titleStr = item.getTitle();
                    String descStr = item.getDesc();
                    Drawable iconDrawble = item.getIcon();
                }
        });
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
    }

}
