/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logiikka.nappulat;

import Logiikka.Nappula;

/**
 *
 * @author nkorkiak@cs
 */
public class Lahetti extends Nappula {
    
    public Lahetti(int x,int y, enum vari) {
        super(x,y,vari);
        super.setTyyppi('B');
    }

    @Override
    public void siirra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean onkoLaillinen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
