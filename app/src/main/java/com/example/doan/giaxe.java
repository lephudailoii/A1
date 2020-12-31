package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class giaxe extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> listhang = new ArrayList<String>();
    ArrayList<xe> listxe = new ArrayList<xe>();
    ListView lvxe;
    xeadapter xead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaxe);
        spinner = findViewById(R.id.spinner);
        Getdata();        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        lvxe=findViewById(R.id.listxe);
        xead = new xeadapter(this,R.layout.itemxe, listxe);
        lvxe.setAdapter(xead);
        listhang.add("Tat Ca");
        listhang.add("HONDA");
        listhang.add("YAMAHA");
        listhang.add("SUZUKI");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,listhang);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: listxe.clear();
                    Getdata();
                    xead.notifyDataSetChanged();
                    break;
                    case 1: listxe.clear();
                        Getdatahonda();
                        xead.notifyDataSetChanged();
                        break;
                    case 2: listxe.clear();
                        Getdataymh();
                        xead.notifyDataSetChanged();
                        break;
                    case 3: listxe.clear();
                        Getdatasuzuki();
                        xead.notifyDataSetChanged();
                        break;
                    default:
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void Getdataymh() { listxe.add(new xe(R.drawable.ymhnvx,"YAMAHA NVX",60000000));
        listxe.add(new xe(R.drawable.ymhex,"YAMAHA EXCITER",45000000));}
    private void Getdatasuzuki() {listxe.add(new xe(R.drawable.suzuki,"SUZUKI RAIDER",65000000));}
    private void Getdatahonda() {listxe.add(new xe(R.drawable.honda1,"HONDA WINNER",55000000));
        listxe.add(new xe(R.drawable.honda2,"HONDA AIRBLADE",50000000));}
    private void Getdata() {
        listxe.add(new xe(R.drawable.honda1,"HONDA WINNER",55000000));
        listxe.add(new xe(R.drawable.honda2,"HONDA AIRBLADE",50000000));
        listxe.add(new xe(R.drawable.ymhnvx,"YAMAHA NVX",60000000));
        listxe.add(new xe(R.drawable.ymhex,"YAMAHA EXCITER",45000000));
        listxe.add(new xe(R.drawable.suzuki,"SUZUKI RAIDER",65000000));
    }

}