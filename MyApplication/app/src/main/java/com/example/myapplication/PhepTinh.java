package com.example.myapplication;

public class PhepTinh {
    private String Ten;
    private String Mota;

    public PhepTinh(String ten, String mota) {
        Ten = ten;
        Mota = mota;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }
}
