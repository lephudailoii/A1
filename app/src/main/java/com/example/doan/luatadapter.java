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

public class luatadapter extends ArrayAdapter {
    Context context;
    int layout;
    ArrayList<itemluat>listluat;
    public luatadapter(@NonNull Context context, int resource, ArrayList<itemluat> listluat) {
        super(context, resource,listluat);
        this.context = context;
        this.listluat = listluat;
        this.layout = resource;

    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        itemluat itemluat = listluat.get(position);

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }


        TextView txtluat = convertView.findViewById(R.id.txtluat);
        txtluat.setText(itemluat.getLuat());
        TextView txtphat = convertView.findViewById(R.id.txtphat);
        txtphat.setText(itemluat.getPhat());

        return convertView;
    }
}
