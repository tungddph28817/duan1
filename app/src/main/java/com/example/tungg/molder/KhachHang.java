package com.example.tungg.molder;

public class KhachHang {
    private int maKH;
    private String hoTen;
    private String soDT;

    public KhachHang() {
    }

    public KhachHang(int maKH, String hoTen, String soDT) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.soDT = soDT;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
}
