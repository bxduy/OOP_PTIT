/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoadon;

/**
 *
 * @author Admin
 */
public class HoaDon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonCaPhe hd = new HoaDonCaPhe("Duy Duy", 400, 1.5);
        System.out.println("Ca phe: " + hd.ten() + ", Tong: " + hd.tinhTongTien());
        System.out.println("Kiem Tra Khoi Luong > 5kg: " + hd.kiemTraKlLonHon(5));
        System.out.println("Kiem Tra Khoi Luong > 1kg: " + hd.kiemTraKlLonHon(1));
        System.out.println("Kiem tra hoa don hon 500k: " + hd.kiemTraTongTienHon500K());
    }
    
}
