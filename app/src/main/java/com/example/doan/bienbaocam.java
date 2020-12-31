package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class bienbaocam extends AppCompatActivity {
    ListView lvbienbao;
    ArrayList<itembienbao> listbienbao = new ArrayList<itembienbao>();
    bienbaoadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienbaocam);
        lvbienbao=findViewById(R.id.listbbcam);
        Getdatacauhoi();
        adapter = new bienbaoadapter(this,R.layout.itembienbao, listbienbao);
        lvbienbao.setAdapter(adapter);
    }
    public void  Getdatacauhoi(){
        listbienbao.add(new itembienbao(R.drawable.bienbaocam1,"CẤM ĐẬU","cấm đậu xe ở đây hoặc cách đây 10m"));
        listbienbao.add(new itembienbao(R.drawable.bienbaocam2,"CẤM ĐI","cấm đi vào đường này"));

    }}
