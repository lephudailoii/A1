package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Cacthesahinh extends AppCompatActivity {
    ListView lvcauhoi;
    ArrayList<cauhoi> listcauhoi;
    ArrayList<cauhoi> listcauhoi2;
    cauhoiadapter adapter;
    dbhelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacthesahinh);
        lvcauhoi=findViewById(R.id.listcacthesahinh);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dbHelper= new dbhelper(Cacthesahinh.this);
        listcauhoi2 = new ArrayList<cauhoi>();
        listcauhoi = new ArrayList<cauhoi>();
        getting();
        listcauhoi.addAll(dbHelper.getSaHinh());
        adapter = new cauhoiadapter(this,R.layout.activity_cacthesahinh, listcauhoi2);
        lvcauhoi.setAdapter(adapter);
    }

    private void getting() {

    }

}
