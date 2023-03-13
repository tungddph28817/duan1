package com.example.tungg.molder;

public class SanPham {
    private int MaSP;
    private String tenSP;
    private String hinhAnh;
    private double giaTien;
    private int soLuong;
    private String moTa;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, String hinhAnh, double giaTien, int soLuong, String moTa) {
        MaSP = maSP;
        this.tenSP = tenSP;
        this.hinhAnh = hinhAnh;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
