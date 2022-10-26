/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khaibaolopthisinh;

/**
 *
 * @author Admin
 */
public class ThiSinh {
    private String ten;
    private String ngay;
    private double diem1, diem2, diem3;

    public ThiSinh(String ten, String ngay, double diem1, double diem2, double diem3) {
        this.ten = ten;
        this.ngay = ngay;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }
    
    public double tong(){
        return this.diem1 + this.diem2 + this.diem3;
    }
    
    public void in(){
        System.out.print(this.ten + " " + this.ngay + " ");
    }
}
