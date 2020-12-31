package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class hethongbaohieu extends AppCompatActivity {
    ListView lvcauhoi;
    ArrayList<cauhoi> listcauhoi2;
    cauhoiadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hethongbaohieu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lvcauhoi=findViewById(R.id.listhethongbaohieu);
        Getdatacauhoi1();
        adapter = new cauhoiadapter(this,R.layout.item, listcauhoi2);
        lvcauhoi.setAdapter(adapter);
    }
    public void  Getdatacauhoi1()
    {

}}
