/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import java.util.*;
;

/**
 *
 * @author nkorkiak@cs
 */
public abstract class Nappula {

    private char tyyppi;
    private boolean vari;
    private Sijainti sijainti;
    
    public Nappula(int x, int y, boolean vari) {
        sijainti = new Sijainti(x,y);
        this.vari = vari;
    }
    
    public abstract void siirra(); {
        
    }
    
    public abstract boolean onkoLaillinen(); 
        
    public void setTyyppi(char tyyppi) {
        
    }
    
    public void setVari(boolean vari) { //true = white, false = black
        this.vari = vari;
    }
    
    @Override
    public String toString() {
        return null;
    }

}
