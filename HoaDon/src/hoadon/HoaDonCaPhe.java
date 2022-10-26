/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoadon;

/**
 *
 * @author Admin
 */
public class HoaDonCaPhe {

    public void setTenLoaiCF(String tenLoaiCF) {
        this.tenLoaiCF = tenLoaiCF;
    }

    public void setGia1Kg(double gia1Kg) {
        this.gia1Kg = gia1Kg;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }
    private String tenLoaiCF;
    private double gia1Kg;
    private double khoiLuong;

    public HoaDonCaPhe(String tenLoaiCF, double gia1Kg, double khoiLuong) {
        this.tenLoaiCF = tenLoaiCF;
        this.gia1Kg = gia1Kg;
        this.khoiLuong = khoiLuong;
    }
    
    
    public double tinhTongTien(){
        return this.gia1Kg * this.khoiLuong;
    }
    public String ten(){
        return this.tenLoaiCF;
    }
    public boolean kiemTraKlLonHon(double kl){
        return this.khoiLuong > kl;
    }
    public boolean kiemTraTongTienHon500K(){
        return this.tinhTongTien() > 500;
    }

    public String getTenLoaiCF() {
        return tenLoaiCF;
    }

    public double getGia1Kg() {
        return gia1Kg;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }
}
