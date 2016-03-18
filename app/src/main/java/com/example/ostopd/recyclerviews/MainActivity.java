package com.example.ostopd.recyclerviews;


import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14;
    EditText[] et = new EditText[14];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        // recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        // Use the default animator
        // recyclerView.setItemAnimator(new DefaultItemAnimator());
        // you could add item decorators
        //	RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        //	recyclerView.addItemDecoration(itemDecoration);
        for (int i = 0; i < 14; i++) {
            et[i] = new EditText(MainActivity.this);
            et[i].setText(String.valueOf(i));
        }

        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            values.add(et[i].getText().toString());
        }
        Log.d("size", String.valueOf(values.size()));

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(values);
        recyclerView.setAdapter(mAdapter);
    }
}