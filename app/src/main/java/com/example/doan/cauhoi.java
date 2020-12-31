package com.example.doan;

import java.io.Serializable;
import java.util.ArrayList;

public class cauhoi implements Serializable {
    ArrayList<cauhoi> listcauhoi;
    int id;
    String stt;
    String cautraloi;
    String cauhoii;
    String dapana;
    String dapanb;
    String dapanc;
    String dapand;
    int iddapana;
    int iddapanb;
    int iddapanc;
    int iddapand;
    int iddapandung;

    public cauhoi(int id, String stt, String cauhoii, String dapana, String dapanb, String dapanc, String dapand,String cautraloi, int iddapana, int iddapanb, int iddapanc, int iddapand, int iddapandung) {
        this.id = id;
        this.stt = stt;
        this.cauhoii = cauhoii;
        this.dapana = dapana;
        this.dapanb = dapanb;
        this.dapanc = dapanc;
        this.dapand = dapand;
        this.cautraloi = cautraloi;
        this.iddapana = iddapana;
        this.iddapanb = iddapanb;
        this.iddapanc = iddapanc;
        this.iddapand = iddapand;
        this.iddapandung = iddapandung;
    }
    public cauhoi( String stt, String cauhoii, String dapana, String dapanb, String dapanc, String dapand,String cautraloi, int iddapana, int iddapanb, int iddapanc, int iddapand, int iddapandung) {
        this.stt = stt;
        this.cauhoii = cauhoii;
        this.dapana = dapana;
        this.dapanb = dapanb;
        this.dapanc = dapanc;
        this.dapand = dapand;
        this.cautraloi = cautraloi;
        this.iddapana = iddapana;
        this.iddapanb = iddapanb;
        this.iddapanc = iddapanc;
        this.iddapand = iddapand;
        this.iddapandung = iddapandung;
    }



    public int getIddapandung() {
        return iddapandung;
    }

    public void setIddapandung(int iddapandung) {
        this.iddapandung = iddapandung;
    }

    public int getIddapana() {
        return iddapana;
    }

    public void setIddapana(int iddapana) {
        this.iddapana = iddapana;
    }

    public int getIddapanb() {
        return iddapanb;
    }

    public void setIddapanb(int iddapanb) {
        this.iddapanb = iddapanb;
    }

    public int getIddapanc() {
        return iddapanc;
    }

    public void setIddapanc(int iddapanc) {
        this.iddapanc = iddapanc;
    }

    public int getIddapand() {
        return iddapand;
    }

    public void setIddapand(int iddapand) {
        this.iddapand = iddapand;
    }





    public cauhoi(String stt, String cauhoii, String dapana, String dapanb, String dapanc, String dapand, String cautraloi) {
        this.stt = stt;
        this.cauhoii = cauhoii;
        this.dapana = dapana;
        this.dapanb = dapanb;
        this.dapanc = dapanc;
        this.dapand = dapand;
        this.cautraloi = cautraloi;

    }
    public cauhoi() {


    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getDapan() {
        return cautraloi;
    }

    public void setDapan(String dapan) {
        this.cautraloi = dapan;
    }


    public String getCauhoii() {
        return cauhoii;
    }

    public void setCauhoii(String cauhoii) {
        this.cauhoii = cauhoii;
    }

    public String getDapana() {
        return dapana;
    }

    public void setDapana(String dapana) {
        this.dapana = dapana;
    }

    public String getDapanb() {
        return dapanb;
    }

    public void setDapanb(String dapanb) {
        this.dapanb = dapanb;
    }

    public String getDapanc() {
        return dapanc;
    }

    public void setDapanc(String dapanc) {
        this.dapanc = dapanc;
    }

    public String getDapand() {
        return dapand;
    }

    public void setDapand(String dapand) {
        this.dapand = dapand;
    }








}
