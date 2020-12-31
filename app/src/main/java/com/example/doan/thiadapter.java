package com.example.doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class thiadapter extends ArrayAdapter<cauhoi> {

    Context context;
    ArrayList<cauhoi> arrayList;
    int layout;

    public thiadapter(@NonNull Context context, int resource, @NonNull ArrayList<cauhoi> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layout = resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(layout,null,false);
        TextView txtcauhoi= convertView.findViewById(R.id.idcauhoi);
        TextView txtdapana = convertView.findViewById(R.id.iddapana);
        TextView txtdapanb = convertView.findViewById(R.id.iddapanb);
        TextView txtdapanc =convertView.findViewById(R.id.iddapanc);
        TextView txtdapand=convertView.findViewById(R.id.iddapand);


        cauhoi cauhoiii = arrayList.get(position);
        txtcauhoi.setText(cauhoiii.getCauhoii());
        txtdapana.setText(cauhoiii.getDapana());
        txtdapanb.setText(cauhoiii.getDapanb());
        txtdapanc.setText(cauhoiii.getDapanc());
        txtdapand.setText(cauhoiii.getDapand());

        return convertView;
    }
}
