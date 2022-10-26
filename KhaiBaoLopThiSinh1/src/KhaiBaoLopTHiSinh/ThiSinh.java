package KhaiBaoLopTHiSinh;

import java.text.DecimalFormat;

public class ThiSinh {
	private String ten, date;
	private double d1, d2, d3;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	public double getD2() {
		return d2;
	}
	public void setD2(double d2) {
		this.d2 = d2;
	}
	public double getD3() {
		return d3;
	}
	public void setD3(double d3) {
		this.d3 = d3;
	}
	
	public static double tong(ThiSinh a) {
		return a.d1 + a.d2 + a.d3;
	}
	public void in(ThiSinh a) {
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(a.ten + " " + a.date + df.format(tong(a)) );
	}
}
