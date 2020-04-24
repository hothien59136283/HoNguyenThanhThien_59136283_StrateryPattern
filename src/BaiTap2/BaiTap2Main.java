/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Pii
 */
public class BaiTap2Main {
    public static void main(String[]argo){
    HangHoa hangHoa1 = new HangHoa("Chuột Gaming cho LapTop", 450000, "chuột MSI bản 2018");
    HangHoa hangHoa2 = new HangHoa("CPU i5", 580000, "cpu i5 đời 8");
        
    GioHang gh1 = new GioHang();
    gh1.themHH(hangHoa1);
    gh1.themHH(hangHoa2);
    gh1.setHinhThucTT(new ThanhToanCOD());
    gh1.inDSHH();
    System.out.println("Tiền khách phải thanh toán trên COD: "+gh1.getThanhToan(gh1.getTienHang())+"\n");
        
    GioHang gh2 = new GioHang();
    gh2.themHH(hangHoa1);
    gh2.themHH(hangHoa2);
    gh2.setHinhThucTT(new ThanhToanOnline());
    gh2.inDSHH();
    System.out.println("Tiền khách phải thanh toán trên Online: "+gh2.getThanhToan(gh2.getTienHang())+"\n");
        
}
}
