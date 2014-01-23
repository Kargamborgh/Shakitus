/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import java.util.*;

/**
 *
 * @author nkorkiak@cs
 */
public class Nappula {

    private String tyyppi;
    private HashMap<Integer,Integer> paikka;
    
    public Nappula(String tyyppi, HashMap paikka) {

        this.tyyppi = tyyppi;
        this.paikka = paikka;
        
    }
    
    @Override
    public String toString() {
        return null;
    }

}
