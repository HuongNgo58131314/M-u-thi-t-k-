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
public class QLDS implements IQLDS{

    ArrayList<CaNhan> dsCaNhans = new ArrayList<>();
    @Override
    public int them(CaNhan p) {
         dsCaNhans.add(p);
            return 1;
    }

    @Override
    public int xoa(String ten) {
        if(dsCaNhans.removeIf(p -> p.hoten==ten))
            return 1;
        return 0;
    }

    @Override
    public void inDS() {
        dsCaNhans.forEach(p->p.HienThiTT());
    }
    
}

