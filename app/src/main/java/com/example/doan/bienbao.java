package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bienbao extends AppCompatActivity {
    ImageButton nutcam,nutnguyhiem,nuthieulenh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienbao);
        nutcam = findViewById(R.id.imgcam);

        nutcam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bienbao.this,bienbaocam.class);
                startActivity(intent);
            }
        });
        nutnguyhiem = findViewById(R.id.imgnguyhiem);
        nutnguyhiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bienbao.this,bienbaonguyhiem.class);
                startActivity(intent);
            }
        });
        nuthieulenh = findViewById(R.id.imghieulenh);
        nuthieulenh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bienbao.this,bienbaohieulenh.class);
                startActivity(intent);
            }
        });

    }
}
