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
    
    

    @Override
    public String HienThiTT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
