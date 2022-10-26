/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysach;

/**
 *
 * @author Admin
 */
public class QuanLySach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ngay ngay1 = new Ngay(15, 2, 2021);
        Ngay ngay2 = new Ngay(15, 9, 2030);
        Ngay ngay3 = new Ngay(15, 9, 2025);
        
        TacGia tacGia1 = new TacGia("Duy Bui", ngay1);
        TacGia tacGia2 = new TacGia("Minh Ngoc", ngay2);
        TacGia tacGia3 = new TacGia("Minh Duy", ngay3);
        
        Sach sach1 = new Sach("Tinh Yeu", 5000, 2023, tacGia1);
        Sach sach2 = new Sach("Tinh Yeu Ngoc", 15000, 2021, tacGia2);
        Sach sach3 = new Sach("Tinh Yeu Ngoc Duy", 25000, 2029, tacGia3);
        
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        
        System.out.println("So NXB sanh sach1 va 3: " + sach1.kiemTraCungNamXuatBan(sach3));
    }
    
}
