package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Khainiemvaquytac extends AppCompatActivity {
    ListView lvcauhoi;
    ArrayList<cauhoi> listcauhoi;
    cauhoiadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khainiemvaquytac);
        lvcauhoi=findViewById(R.id.listkhainiem);
        Getdatacauhoi4();
        cauhoi cauhoi= new cauhoi();
        adapter = new cauhoiadapter(this,R.layout.activity_khainiemvaquytac, listcauhoi);
        lvcauhoi.setAdapter(adapter);
    }
    public void  Getdatacauhoi4(){

}}
