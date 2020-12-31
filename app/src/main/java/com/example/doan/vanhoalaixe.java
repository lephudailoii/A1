package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class vanhoalaixe extends AppCompatActivity {
    ListView lvcauhoi;
    ArrayList<cauhoi> listcauhoi;
    cauhoiadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vanhoalaixe);
        lvcauhoi=findViewById(R.id.listtatca);
        Getdatacauhoi2();
        adapter = new cauhoiadapter(this,R.layout.activity_vanhoalaixe, listcauhoi);
        lvcauhoi.setAdapter(adapter);
    }
    public void  Getdatacauhoi2()
    {


    }
}
