package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class bienbaohieulenh extends AppCompatActivity {
    ListView lvbienbao;
    ArrayList<itembienbao> listbienbao = new ArrayList<>();
    bienbaoadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienbaohieulenh);
        lvbienbao=findViewById(R.id.listbbhieulenh);
        Getdatacauhoi();
        adapter = new bienbaoadapter(this,R.layout.itembienbao, listbienbao);
        lvbienbao.setAdapter(adapter);
    }
    public void  Getdatacauhoi(){
        listbienbao.add(new itembienbao(R.drawable.bienbaohieulenh1,"ĐI BÊN PHẢI","bắt buộc quẹo phải"));
        listbienbao.add(new itembienbao(R.drawable.bienbaohieulenh2,"ĐI BÊN TRÁI","bắt buộc quẹo trái"));

    }}
