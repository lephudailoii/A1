package com.example.doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

public class xeadapter extends ArrayAdapter {
    Context context;
    ArrayList<xe> listxe;
    int layout;

    public xeadapter(@NonNull Context context, int resource, ArrayList<xe> listxe) {
        super(context, resource,listxe);
        this.context = context;
        this.listxe = listxe;
        this.layout = resource;

    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(layout,null,false);
        ImageView imghinhxe = convertView.findViewById(R.id.hinhxe);
        TextView txttenxe = convertView.findViewById(R.id.txttenxe);
        TextView txtgiaxe = convertView.findViewById(R.id.txtgiaxe);

        xe xee = listxe.get(position);
        imghinhxe.setImageResource(xee.getHinhxe());
        txttenxe.setText("Tên Xe : "+xee.getTenxe());
        txtgiaxe.setText("Giá Xe : "+String.valueOf(xee.getGiaxe()));
        return convertView;
    }
}

