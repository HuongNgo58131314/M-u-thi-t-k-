/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huong_58131314_Baitap1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LopHoc {
    IQLDS qldsHS = new QLDS();
    IQLDS qldsGVGD = new QLDS();
    ArrayList<GiaoVien> dsgv = new ArrayList<>();
    ArrayList<HocSinh> dshs = new ArrayList<>();
    GiaoVien gvcn = new GiaoVien();

    public LopHoc(GiaoVien gvcn) {
       this.gvcn = gvcn;
    }
   
    public int themHocSinh(HocSinh hs)
    {
        if(qldsHS.them(hs) == 1)
            return 1;
        return 0;
    }
    public int themGVGD(GiaoVien gv){
        if(qldsGVGD.them(gv) == 1)
            return 1;
        return 0;
    }
    
    public int inDSHS()
    {
        qldsHS.inDS();
        return 1;
    }
    public int inDSGVDG()
    {
        qldsGVGD.inDS();
        return 1;
    }
    
}
