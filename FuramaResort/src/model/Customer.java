package src.model;

import java.util.Date;

public class Customer extends Person{
    int maKH;
    String loaiKhach;
    String diaChi;

    public Customer() {
    }
    public Customer(String hoTen, String ngaySinh, String gioiTinh, int cmnd, String sdt, String email, int maKH, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.maKH = maKH;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKH=" + maKH +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cmnd=" + cmnd +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}' + '\n';
    }
}
