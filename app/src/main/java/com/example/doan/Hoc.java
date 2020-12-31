package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Hoc extends AppCompatActivity {
    ImageButton nuttatca,nutcacthesahinh,nutkhainiem,nutvanhoa,nuthethong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc);
        nuttatca = findViewById(R.id.imageButtonall);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nuttatca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoc.this,hocbaibai.class);
                startActivity(intent);
            }
        });
        nutcacthesahinh = findViewById(R.id.imageButtonsahinh);
        nutcacthesahinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoc.this,hocbaibai.class);
                startActivity(intent);
            }
        });
        nutkhainiem = findViewById(R.id.imageButtonkhainiem);
        nutkhainiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoc.this,hocbaibai.class);
                startActivity(intent);
            }
        });
        nutvanhoa = findViewById(R.id.imageButtonvanhoa);
        nutvanhoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoc.this,hocbaibai.class);
                startActivity(intent);
            }
        });
        nuthethong = findViewById(R.id.imageButtonhethong);
        nuthethong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoc.this,hocbaibai.class);
                startActivity(intent);
            }
        });
    }
}
