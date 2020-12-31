package com.example.doan;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
public class luatdibo extends ListFragment {
    ListView list;
    ArrayList<itemluat> arrayList=new ArrayList<itemluat>();
    luatadapter luatadapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.luatdibo, container, false);
        Getdata();
        luatadapter = new luatadapter(getActivity(),R.layout.itemluat,arrayList);
        setListAdapter(luatadapter);
        return view;

    }
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        int vitri = position;
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        switch (vitri){
            case 0:
                dialog.setTitle("Luật Đi Bộ");
                dialog.setMessage("- Không được đi lên những cây cầu có biển cấm người đi bộ");
                dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                break;
            case 1:
                dialog.setTitle("Luật Đi Bộ");
                dialog.setMessage("- Không được đi dưới lòng lề đường , đường cao tốc");
                dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                break;}}

    private void Getdata() {
        arrayList.add(new itemluat("Cấm đi lên cầu","200,000 VND"));
        arrayList.add(new itemluat("Cấm đi vào làn đường này","200,000 VND"));
    }}
