package com.example.doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bienbaoadapter extends ArrayAdapter {
    Context context;
    ArrayList<itembienbao> listbb;
    int layout;

    public bienbaoadapter(@NonNull Context context, int resource, ArrayList<itembienbao> listbb) {
        super(context, resource,listbb);
        this.context = context;
        this.listbb = listbb;
        this.layout = resource;

    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(layout,null,false);
        itembienbao bb = listbb.get(position);
        ImageView imgg = convertView.findViewById(R.id.hinhbienbao);
        TextView txttren = convertView.findViewById(R.id.txttren);
        TextView txtduoi = convertView.findViewById(R.id.txtduoi);

        imgg.setImageResource(bb.getHinhbb());
        txttren.setText(bb.getDongtren());
        txtduoi.setText(bb.getDongduoi());
        return convertView;
    }
}



