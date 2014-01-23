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
    
    public Nappula() {

        
    }
    
    public abstract void siirra(); {
        
    }
    
    public abstract boolean onkoLaillinen(); 
        
    public void setTyyppi(char tyyppi) {
        
    }
    
    @Override
    public String toString() {
        return null;
    }

}
