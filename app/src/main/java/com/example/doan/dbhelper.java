package com.example.doan;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class dbhelper {
    Context context;
    String dbcauhoi = "BangThi.db";

    public dbhelper(Context context) {
        this.context = context;
    }

    private SQLiteDatabase openDB() {
        return context.openOrCreateDatabase(dbcauhoi, Context.MODE_PRIVATE, null);
    }

    private void closeDB(SQLiteDatabase db) {
        db.close();
    }


    public void createLuatTable() {
        SQLiteDatabase db = openDB();
        String sql = "create table if not exists tblLuat(" +
                "id integer PRIMARY KEY autoincrement, " +
                "luat text," +
                "mucphat text " +
                ");";
        db.execSQL(sql);
        closeDB(db);
    }
    public void insertLuat(itemluat l) {
        SQLiteDatabase db = openDB();
        ContentValues cv = new ContentValues();
        cv.put("luat", l.luat);
        cv.put("mucphat", l.phat);
        db.insert("tblLuat", null, cv);
        closeDB(db);
    }
    public ArrayList<itemluat> getallluat() {
        SQLiteDatabase db = openDB();
        ArrayList<itemluat> arr = new ArrayList<>();
        String sql = "select * from tblLuat";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String luat = csr.getString(1);
                    String mucphat = csr.getString(2);
                    arr.add(new itemluat(id,luat,mucphat));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }
    public void createUserTable() {
        SQLiteDatabase db = openDB();
        String sql = "create table if not exists tblCauHoi(" +
                "id integer PRIMARY KEY autoincrement, " +
                "stt text," +
                "cauhoii text, " +
                "dapana text," +
                "dapanb text," +
                "dapanc text," +
                "dapand text," +
                "cautraloi text," +
                "iddapana integer," +
                "iddapanb integer," +
                "iddapanc integer," +
                "iddapand integer," +
                "iddapandung integer" +
                ");";
        db.execSQL(sql);
        closeDB(db);
    }


    public ArrayList<cauhoi> getUsers() {
        SQLiteDatabase db = openDB();
        ArrayList<cauhoi> arr = new ArrayList<>();
        String sql = "select * from tblCauHoi";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String stt = csr.getString(1);
                    String cauhoii = csr.getString(2);
                    String dapana = csr.getString(3);
                    String dapanb = csr.getString(4);
                    String dapanc = csr.getString(5);
                    String dapand = csr.getString(6);
                    String cautraloi = csr.getString(7);
                    int iddapana = csr.getInt(8);
                    int iddapanb = csr.getInt(9);
                    int iddapanc = csr.getInt(10);
                    int iddapand = csr.getInt(11);
                    int iddapandung = csr.getInt(12);
                    arr.add(new cauhoi(id,stt,cauhoii,dapana,dapanb,dapanc,dapand,cautraloi,iddapana,iddapanb,iddapanc,iddapand,iddapandung));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }
    public ArrayList<cauhoi> getSaHinh() {
        SQLiteDatabase db = openDB();
        ArrayList<cauhoi> arr = new ArrayList<>();
        String sql = "select * from tblCauHoi where id > 10";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String stt = csr.getString(1);
                    String cauhoii = csr.getString(2);
                    String dapana = csr.getString(3);
                    String dapanb = csr.getString(4);
                    String dapanc = csr.getString(5);
                    String dapand = csr.getString(6);
                    String cautraloi = csr.getString(7);
                    int iddapana = csr.getInt(8);
                    int iddapanb = csr.getInt(9);
                    int iddapanc = csr.getInt(10);
                    int iddapand = csr.getInt(11);
                    int iddapandung = csr.getInt(12);
                    arr.add(new cauhoi(id,stt,cauhoii,dapana,dapanb,dapanc,dapand,cautraloi,iddapana,iddapanb,iddapanc,iddapand,iddapandung));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }


    public cauhoi getUser(int uId) {
        SQLiteDatabase db = openDB();
        String sql="Select * from tblUser where id = "+ uId;
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor != null)
            cursor.moveToFirst();
        int id = cursor.getInt(0);
        String stt = cursor.getString(1);
        String cauhoii = cursor.getString(2);
        String dapana = cursor.getString(3);
        String dapanb = cursor.getString(4);
        String dapanc = cursor.getString(5);
        String dapand = cursor.getString(6);
        String cautraloi = cursor.getString(7);
        int iddapana = cursor.getInt(8);
        int iddapanb = cursor.getInt(9);
        int iddapanc = cursor.getInt(10);
        int iddapand = cursor.getInt(11);
        int iddapandung = cursor.getInt(12);
        closeDB(db);
        return new cauhoi(id,stt,cauhoii,dapana,dapanb,dapanc,dapand,cautraloi,iddapana,iddapanb,iddapanc,iddapand,iddapandung);
    }
    public void insertCauHoi(cauhoi ch) {
        SQLiteDatabase db = openDB();
        ContentValues cv = new ContentValues();
        cv.put("stt", ch.stt);
        cv.put("cauhoii", ch.cauhoii);
        cv.put("dapana", ch.dapana);
        cv.put("dapanb", ch.dapanb);
        cv.put("dapanc", ch.dapanc);
        cv.put("dapand", ch.dapand);
        cv.put("cautraloi", ch.cautraloi);
        cv.put("iddapana", ch.iddapana);
        cv.put("iddapanb", ch.iddapanb);
        cv.put("iddapanc", ch.iddapanc);
        cv.put("iddapand", ch.iddapand);
        cv.put("iddapandung", ch.iddapandung);
        db.insert("tblcauhoi", null, cv);
        closeDB(db);
    }






}

