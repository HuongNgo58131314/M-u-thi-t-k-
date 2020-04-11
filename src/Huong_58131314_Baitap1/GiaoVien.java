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
public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoten, int tuoi, String diaChi, String sdt) {
        super(hoten, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    
    

    @Override
    public String HienThiTT() {
        String thongTinGV = "";
        thongTinGV = "Họ tên: " +this.hoten+ "Tuổi: "+this.tuoi+ "SDT: "+this.sdt+
            "Địa chỉ: "+this.diaChi+ "Môn dạy: "+this.monDay+"Bộ môn: "+this.toBoMon;
        System.out.println(thongTinGV);
        return thongTinGV;
    }
    
}
