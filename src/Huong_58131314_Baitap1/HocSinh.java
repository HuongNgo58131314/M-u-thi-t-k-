/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huong_58131314_Baitap1;

/**
 *
 * @author Admin
 */
public class HocSinh extends CaNhan{
    String lop;
    String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String lop, String nangKhieu, String hoten, int tuoi, String diaChi, String sdt) {
        super(hoten, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    

    @Override
    public String HienThiTT() {
           String thongTinHS = "";
                thongTinHS = "Họ tên: "+this.hoten+ " Tuổi: "+this.tuoi+ " Địa chỉ: "+this.diaChi+ 
                   " SĐT: "+this.sdt+ " Lớp: "+this.lop+ " Năng khiếu: "+this.nangKhieu;
                System.out.println(thongTinHS);
           return thongTinHS;
    }
    
}
