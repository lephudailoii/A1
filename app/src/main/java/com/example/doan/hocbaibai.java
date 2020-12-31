package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class hocbaibai extends AppCompatActivity {
    ListView lvcauhoi;
    ArrayList<cauhoi> listcauhoi ;
    cauhoiadapter adapter;
    dbhelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hocbaibai);
        lvcauhoi=findViewById(R.id.listtatca);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listcauhoi = new ArrayList<>();
        dbHelper= new dbhelper(hocbaibai.this);
       listcauhoi.addAll(dbHelper.getUsers());
        adapter = new cauhoiadapter(hocbaibai.this,R.layout.item, listcauhoi);
        lvcauhoi.setAdapter(adapter);
    }



    }

