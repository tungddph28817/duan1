package com.example.tungg.molder;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private String diaChi;
    private String namSinh;
    private String taiKhoan;
    private String matKhau;
    private String hinhAnh;
    private String status;

    public NhanVien(String maNV, String hoTen, String diaChi, String namSinh, String taiKhoan, String matKhau, String hinhAnh, String status) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hinhAnh = hinhAnh;
        this.status = status;
    }

    public NhanVien() {
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
