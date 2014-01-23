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

    private String tyyppi;
    
    public Nappula(String tyyppi) {

        this.tyyppi = tyyppi;
        
    }
    
    public abstract void siirra(); {
        
    }
    
    public abstract boolean onkoLaillinen(); 
        
    
    
    @Override
    public String toString() {
        return null;
    }

}
