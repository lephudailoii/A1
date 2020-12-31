package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class ketqua extends AppCompatActivity implements truyencauhoi{
    TextView txtketqua,txttest,txtstt;
    ImageButton back,next;
    ArrayList<cauhoi> listcauhoi1 = new ArrayList<cauhoi>();
    ArrayList<Integer> listid1 = new ArrayList<Integer>();
    ArrayList<Integer> listchose1 = new ArrayList<Integer>();
    dbhelper dbHelper;
    truyencauhoi truyench;
    int vitri = 0;
    int colordung = Color.GREEN;
    int colorsai = Color.RED;
    int colorreset = Color.WHITE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);
        back = findViewById(R.id.btnback);
        next = findViewById(R.id.btnnext);
        txtstt=findViewById(R.id.txtsttcau2);
        txtketqua = findViewById(R.id.ketqua);
        txttest = findViewById(R.id.test);
        dbHelper = new dbhelper(ketqua.this);
        truyench = this;
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        String diem = String.valueOf(bundle.getInt("diem",0));
        listid1.addAll(bundle.getIntegerArrayList("ketqua"));
        listchose1.addAll(bundle.getIntegerArrayList("chose"));
        listcauhoi1.addAll(dbHelper.getUsers());
        if(listchose1.size()!=0){
            cauhoi a = new cauhoi();
            txtstt.setText("Cau :"+(vitri +1));
            a = listcauhoi1.get(listid1.get(0));
            int dung = a.getIddapandung();
            truyench.Datacauhoikq(listcauhoi1.get(listid1.get(0)),listchose1.get(0),dung);
        }


        nut();
        int score = Integer.valueOf(diem);
        if (score >=16)
        {
            txttest.setText("XIN CHÚC MỪNG BẠN ĐÃ ĐẬU");
        }
        else
        {txttest.setText("BẠN ĐÃ THẤT BẠI , XIN HÃY CỐ GẮNG LẦN SAU");}
        txtketqua.setText(diem);


    }

    private void nut() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vitri!=0) {
                    vitri--;
                    cauhoi b = new cauhoi();
                    b = listcauhoi1.get(listid1.get(vitri));
                    int dung = b.getIddapandung();

                    truyench.Datacauhoikq(listcauhoi1.get(listid1.get(vitri)),listchose1.get(vitri),dung);
                    txtstt.setText("Cau :"+(vitri +1));

                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vitri <=listchose1.size()-2) {
                    vitri++;
                    cauhoi b = new cauhoi();
                    b = listcauhoi1.get(listid1.get(vitri));
                    int dung = b.getIddapandung();
                    truyench.Datacauhoikq(listcauhoi1.get(listid1.get(vitri)),listchose1.get(vitri),dung);
                    txtstt.setText("Cau :"+(vitri +1));

                }
            }
        });
    }
    @Override
    public void Datacauhoi(cauhoi cauhoii) {
        fragthi ft = (fragthi) getSupportFragmentManager().findFragmentById(R.id.fragketqua);
        ft.Setdata(cauhoii);


    }
    @Override
    public void Datacauhoikq(cauhoi cauhoii,int vitrichon,int vitridapan) {
        fragthi ft = (fragthi) getSupportFragmentManager().findFragmentById(R.id.fragketqua);
        ft.Setdata(cauhoii);
        if (vitrichon == vitridapan) {
            switch (vitrichon) {
                case 1:
                    ft.dapanb.setBackgroundColor(colorreset);
                    ft.dapand.setBackgroundColor(colorreset);
                    ft.dapanc.setBackgroundColor(colorreset);
                    ft.dapana.setBackgroundColor(colordung);
                    break;
                case 2:
                    ft.dapana.setBackgroundColor(colordung);
                    ft.dapanb.setBackgroundColor(colorreset);
                    ft.dapand.setBackgroundColor(colorreset);
                    ft.dapanc.setBackgroundColor(colorreset);
                    break;
                case 3:
                    ft.dapana.setBackgroundColor(colordung);
                    ft.dapanb.setBackgroundColor(colorreset);
                    ft.dapand.setBackgroundColor(colorreset);
                    ft.dapanc.setBackgroundColor(colorreset);
                    break;
                case 4:
                    ft.dapana.setBackgroundColor(colordung);
                    ft.dapanb.setBackgroundColor(colorreset);
                    ft.dapand.setBackgroundColor(colorreset);
                    ft.dapanc.setBackgroundColor(colorreset);
                    break;
                default:
            }
        }
        if (vitrichon != vitridapan){
            ft.dapand.setBackgroundColor(colorreset);
            ft.dapanb.setBackgroundColor(colorreset);
            ft.dapana.setBackgroundColor(colorreset);
            ft.dapanc.setBackgroundColor(colorreset);
            switch (vitridapan) {
                case 1:
                    ft.dapana.setBackgroundColor(colordung);
                    break;
                case 2:
                    ft.dapanb.setBackgroundColor(colordung);
                    break;
                case 3:
                    ft.dapanc.setBackgroundColor(colordung);
                    break;
                case 4:
                    ft.dapand.setBackgroundColor(colordung);
                    break;
                default:
            }
            switch (vitrichon) {
                case 1:
                    ft.dapana.setBackgroundColor(colorsai);
                    break;
                case 2:
                    ft.dapanb.setBackgroundColor(colorsai);
                    break;
                case 3:
                    ft.dapanc.setBackgroundColor(colorsai);
                    break;
                case 4:
                    ft.dapand.setBackgroundColor(colorsai);
                    break;
                default:
            }
    }
    }

}
