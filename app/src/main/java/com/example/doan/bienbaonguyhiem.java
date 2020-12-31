package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class bienbaonguyhiem extends AppCompatActivity {
    ListView lvbienbao;
    ArrayList<itembienbao> listbienbao = new ArrayList<itembienbao>();
    bienbaoadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienbaonguyhiem);
        lvbienbao=findViewById(R.id.listbbnguyhiem);
        Getdatacauhoi();
        adapter = new bienbaoadapter(this,R.layout.itembienbao, listbienbao);
        lvbienbao.setAdapter(adapter);
    }
    public void  Getdatacauhoi(){
        listbienbao.add(new itembienbao(R.drawable.bienbaonguyhiem1,"KHÚC CUA TRÁI NGUY HIỂM","nguy hiểm khi quẹo trái"));
        listbienbao.add(new itembienbao(R.drawable.biennaonguyhiem2,"KHÚC CUA PHẢI NGUY HIỂM","nguy hiểm khi quẹo phải"));

    }}
