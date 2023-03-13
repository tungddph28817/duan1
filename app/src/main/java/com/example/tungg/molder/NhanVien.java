package com.example.tungg.molder;

public class NhanVien {
    private int maNV;
    private String hoTen;
    private String soDT;
    private String chucDanh;
    private String trangThai;

    public NhanVien() {
    }

    public NhanVien(int maNV, String hoTen, String soDT, String chucDanh, String trangThai) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.chucDanh = chucDanh;
        this.trangThai = trangThai;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
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

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
