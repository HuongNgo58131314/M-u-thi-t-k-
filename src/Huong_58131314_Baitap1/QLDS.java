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

    ArrayList<CaNhan> dsCaNhan = new ArrayList();
    @Override
    public int them(CaNhan p) {
         dsCaNhan.add(p);
            return 1;
    }

    @Override
    public int xoa(String ten) {
        dsCaNhan.remove(0);
            return 0;
    }

    @Override
    public void inDS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

