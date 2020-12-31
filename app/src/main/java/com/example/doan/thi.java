package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import static com.example.doan.R.*;

public class thi extends AppCompatActivity implements truyencauhoi{
    Button btna,btnb,btnc,btnd;
    TextView txt;
    ArrayList<cauhoi> listcauhoi = new ArrayList<cauhoi>();
    ArrayList<Integer> listid = new ArrayList<Integer>();
    ArrayList<Integer> listchose = new ArrayList<Integer>();
    dbhelper dbHelper;
    int ida=1;
    int idb=2;
    int idc=3;
    int idd=4;
    truyencauhoi truyench;
     int vitri = 0;
     int ketthuc = 0;
    int diem = 0;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_thi);
        dbHelper = new dbhelper(thi.this);
        pb= findViewById(id.probar);
        txt = findViewById(id.txtsttcau);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CountDownTimer cd = new CountDownTimer(1200000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int current = pb.getProgress();
                pb.setProgress(current+1);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(thi.this, ketqua.class);
                Bundle bundle = new Bundle();
                bundle.putIntegerArrayList("ketqua", listid);
                bundle.putIntegerArrayList("chose", listchose);
                bundle.putInt("diem",diem);
                intent.putExtra("dulieu",bundle);
                startActivity(intent);
            }
        };
        cd.start();
        truyench = this;
        btna = findViewById(id.btndapana);
        btnb = findViewById(id.btndapanb);
        btnc = findViewById(id.btndapanc);
        btnd = findViewById(id.btndapand);
        listcauhoi.addAll(dbHelper.getUsers());
        getid();
        txt.setText("Cau :" +(vitri+1));
        truyench.Datacauhoi(listcauhoi.get(listid.get(0)));
        nut();


    }

    private void nut() {
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketthuc++;
                cauhoi a = new cauhoi();
                a = listcauhoi.get(listid.get(vitri));
                vitri++;
                int dung = a.getIddapandung();
                if (ida == dung) {
                    diem++;
                }
                listchose.add(ida);
                truyench.Datacauhoi(listcauhoi.get(listid.get(vitri)));
                txt.setText("Cau :" +(vitri+1));
                if (ketthuc == 20) {
                    Intent intent = new Intent(thi.this, ketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putIntegerArrayList("ketqua", listid);
                    bundle.putIntegerArrayList("chose", listchose);
                    bundle.putInt("diem",diem);
                    intent.putExtra("dulieu",bundle);
                    startActivity(intent);
                }
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketthuc++;
                cauhoi a = new cauhoi();
                a = listcauhoi.get(listid.get(vitri));
                vitri++;
                int dung = a.getIddapandung();
                if (idb == dung) {
                    diem++;
                }
                listchose.add(idb);
                truyench.Datacauhoi(listcauhoi.get(listid.get(vitri)));
                txt.setText("Cau :" +(vitri+1));
                if (ketthuc == 20) {
                    Intent intent = new Intent(thi.this, ketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putIntegerArrayList("ketqua", listid);
                    bundle.putIntegerArrayList("chose", listchose);
                    bundle.putInt("diem",diem);
                    intent.putExtra("dulieu",bundle);
                    startActivity(intent);
                }
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketthuc++;
                cauhoi a = new cauhoi();
                a = listcauhoi.get(listid.get(vitri));
                vitri++;
                int dung = a.getIddapandung();
                if (idc == dung) {
                    diem++;
                }
                listchose.add(idc);
                truyench.Datacauhoi(listcauhoi.get(listid.get(vitri)));
                txt.setText("Cau :" +(vitri+1));
                if (ketthuc == 20) {
                    Intent intent = new Intent(thi.this, ketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putIntegerArrayList("ketqua", listid);
                    bundle.putIntegerArrayList("chose", listchose);
                    bundle.putInt("diem",diem);
                    intent.putExtra("dulieu",bundle);

                    startActivity(intent);
                }
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ketthuc++;
                cauhoi a = new cauhoi();
                a = listcauhoi.get(listid.get(vitri));
                vitri++;
                int dung = a.getIddapandung();
                if (idd == dung) {
                    diem++;
                }
                listchose.add(idd);
                truyench.Datacauhoi(listcauhoi.get(listid.get(vitri)));
                txt.setText("Cau :" +(vitri+1));
                if (ketthuc == 20) {
                    Intent intent = new Intent(thi.this, ketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putIntegerArrayList("ketqua", listid);
                    bundle.putIntegerArrayList("chose", listchose);
                    bundle.putInt("diem",diem);
                    intent.putExtra("dulieu",bundle);
                    startActivity(intent);
                }
            }
        });

    }


    private void getid() {
        do{ Random r = new Random();
            int a=r.nextInt(29);
            int dem=0;
            for(int i=0;i<listid.size();i++)
            {
                if(listid.get(i) !=a)
                {
                    dem++;
                }
            }
            if(dem==listid.size()){

                listid.add(a);}
        }while (listid.size()!=21);}



    @Override
    public void Datacauhoi(cauhoi cauhoii) {
        fragthi ft = (fragthi) getSupportFragmentManager().findFragmentById(id.fragment);
        ft.Setdata(cauhoii);
    }
    @Override
    public void Datacauhoikq(cauhoi cauhoii,int vitrichon,int vitridapan) {

    }



}
