package com.example.doan;

public class itemluat {
    int id;
     String luat;
     String phat;

    public itemluat(int id, String luat, String phat) {
        this.id = id;
        this.luat = luat;
        this.phat = phat;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLuat() {
        return luat;
    }

    public void setLuat(String luat) {
        this.luat = luat;
    }

    public String getPhat() {
        return phat;
    }

    public void setPhat(String phat) {
        this.phat = phat;
    }



    public itemluat(String luat, String phat) {
        this.luat = luat;
        this.phat = phat;
    }
}
