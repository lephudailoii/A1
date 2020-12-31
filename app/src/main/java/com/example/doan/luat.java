package com.example.doan;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.doan.ui.main.sectionpager;

public class luat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acluat);


        sectionpager sectionsPagerAdapter = new sectionpager(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager1);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs1);
        tabs.setupWithViewPager(viewPager);

    }
}