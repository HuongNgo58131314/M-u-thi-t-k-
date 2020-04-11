/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huong_58131314_Baitap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NgoThiHuong_BaiTap1_Tuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tạo một giáo viên chủ nhiệm
        GiaoVien gvcn = new GiaoVien();
        gvcn.setHoten("Nguyễn Văn An");
        gvcn.setDiaChi("Nha Trang - Khánh Hòa");
        gvcn.setSdt("098276827");
        gvcn.setMonDay("Kỹ thuật lập trình");
        gvcn.setToBoMon("Công nghệ phần mềm");
        
        //Tạo một giáo viên chủ nhiệm ứng với lớp học
        LopHoc lopHoc = new LopHoc(gvcn);
        
        //Tạo học sinh vào lớp học
        HocSinh hs1 = new HocSinh();
        hs1.setHoten("Nguyễn Thị Lan");
        hs1.setTuoi(21);
        hs1.setSdt("096783947");
        hs1.setDiaChi("Nha Trang - Khánh Hòa");
        hs1.setLop("59TH1");
        hs1.setNangKhieu("Lập trình");
        //Thêm một hs1 vào lớp
        lopHoc.themHocSinh(hs1);
        //Thêm hs2 vào lớp
        //HocSinh hs2 = new HocSinh();
        HocSinh hs2 = new HocSinh("59TH1","Lập trình","Nguyễn Thành Long", 22, "Khánh hòa", "09427623");
        lopHoc.themHocSinh(hs2);
        
        Scanner input = new Scanner(System.in);
        //In ds học sinh trong lớp
        lopHoc.inDSHS();
    }
    
}
