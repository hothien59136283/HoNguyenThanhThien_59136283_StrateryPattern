/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
  import java.util.ArrayList;
  import java.util.List;
/**
 *
 * @author Pii
 */
public class QLSV {
    List<SinhVien> DanhSachSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    
    public void themSV(SinhVien sinhvien) {
        DanhSachSV.add(sinhvien);
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }
    
    public void sapXep() {
        SinhVien SVien = new SinhVien();
        for(int i=0; i<DanhSachSV.size(); i++) {
            for(int j=i+1; j<DanhSachSV.size(); j++) {
                if(soSanh.soSanh(DanhSachSV.get(i), DanhSachSV.get(j)) <= 0) {
                    SVien = DanhSachSV.get(i);
                    DanhSachSV.set(i, DanhSachSV.get(j));
                    DanhSachSV.set(j, SVien);
                }
            }
        }
        
    }
    
    public void inDS() {
        for(SinhVien sinhVien: DanhSachSV) {
            System.out.println(sinhVien.inTT()+"\n");
        }
    }
}
