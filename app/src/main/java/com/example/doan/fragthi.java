package com.example.doan;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragthi extends Fragment {
    TextView cauhoi,dapana,dapanb,dapanc,dapand;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragthi,container,false);
        cauhoi=view.findViewById(R.id.cauhoi);
        dapana=view.findViewById(R.id.dapana);
        dapanb=view.findViewById(R.id.dapanb);
        dapanc=view.findViewById(R.id.dapanc);
        dapand=view.findViewById(R.id.dapand);
        return view;


    }
    public void Setdata(cauhoi ch){
        cauhoi.setText("Câu Hỏi: "+ch.getCauhoii());
        dapana.setText("A: "+ch.getDapana());
        dapanb.setText("B: "+ch.getDapanb());
        dapanc.setText("C: "+ch.getDapanc());
        dapand.setText("D: "+ch.getDapand());

    }



}
