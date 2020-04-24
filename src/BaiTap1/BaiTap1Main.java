/*
 * To change this license header, choose License Headers in ProjeContextProperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Pii
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        context Context=new context();
        Context.setTinhtoan(new Cong());
        System.out.println("kết quả tổng 75 + 12 là: "+Context.tinh(75, 12));
        Context.setTinhtoan(new Tru());
        System.out.println("kết quả hiệu 54 - 78 là: "+Context.tinh(54, 78));
    }
    
}
