/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Pii
 */
public class BaiTap3Main{
public static void main(String[] args) throws ParseException{
    SimpleDateFormat ns = new SimpleDateFormat("dd-MM-yyyy");
        SinhVien sv1 = new SinhVien("Nguyễn Thiện", ns.parse("08-09-1999"), 8.5f);
        SinhVien sv2 = new SinhVien("Nguyễn Phương Nguyên", ns.parse("01-12-1998"), 7.0f);
        SinhVien sv3 = new SinhVien("Thiên Phú", ns.parse("05-02-1999"), 5.5f);
        SinhVien sv4 = new SinhVien("Nguyễn Vin", ns.parse("12-01-1998"), 8.8f);
        SinhVien sv5 = new SinhVien("Hoàng Hà", ns.parse("01-08-1997"), 10.0f);
        
        QLSV dsSinhVien = new QLSV();
        dsSinhVien.themSV(sv1);
        dsSinhVien.themSV(sv2);
        dsSinhVien.themSV(sv3);
        dsSinhVien.themSV(sv4);
        dsSinhVien.themSV(sv5);
        
        dsSinhVien.setSoSanh(new SoSanhTheoTen());
        dsSinhVien.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo tên:"+"\n");
        dsSinhVien.inDS();
        
        dsSinhVien.setSoSanh(new SoSanhTheoDiem());
        dsSinhVien.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo điểm:"+"\n");
        dsSinhVien.inDS();
}
}