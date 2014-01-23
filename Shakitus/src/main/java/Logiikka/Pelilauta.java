/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import Logiikka.nappulat.*;
import java.util.*;

/**
 *
 * @author nkorkiak@cs
 */
public class Pelilauta {

    private char[][] lauta;
    private List<Nappula> valkoiset;
    private List<Nappula> mustat;

    public Pelilauta() {

        

        for (int rivi = 0; rivi <= 7; rivi++) {
            for (int sarake = 0; sarake <= 7; sarake++) {
                lauta[rivi][sarake] = (char) ('1' + rivi * 7 + sarake);
            }
        }
    }

    public void tulostaLauta() {
        for (int rivi = 0; rivi <= 7; rivi++) {
            for (int sarake = 0; sarake <= 7; sarake++) {
                System.out.println(lauta[rivi][sarake]);
            }
        }
    }
    
    private void luoNappulat() {
        
        valkoiset = new ArrayList<Nappula>();
        mustat = new ArrayList<Nappula>();
        
        for (Nappula n : valkoiset) {
            for (int i = 0; i <= 7; i++) {
                int j = 1;
                valkoiset.add(new Sotilas(i,j,true));
            }
            int j = 0;
            for (int i = 0; i <= 7; i += 7) {
                valkoiset.add(new Torni(i,j,true));
            }
            for (int i = 1; i <= 6; i += 5) {
                valkoiset.add(new Ratsu(i,j,true));
            }
            for (int i = 2; i <= 5; i+= 3) {
                valkoiset.add(new Lahetti(i,j,true));
            }
                int i = 3;
                valkoiset.add(new Kuningatar(i,j,true));
                i = 4;
                valkoiset.add(new Kuningas(i,j,true));
            
        }
        
        for (Nappula n : mustat) {
            for (int i = 0; i <= 7; i++) {
                int j = 6;
                mustat.add(new Sotilas(i,j,false));
            }
                int j = 7;
            for (int i = 0; i <= 7; i += 7) {
                mustat.add(new Torni(i,j,false));
            }
            for (int i = 1; i <= 6; i += 5) {
                mustat.add(new Ratsu(i,j,false));
            }
            for (int i = 2; i <= 5; i+= 3) {
                mustat.add(new Lahetti(i,j,false));
            }
                int i = 3;
                mustat.add(new Kuningatar(i,j,false));
                i = 4;
                mustat.add(new Kuningas(i,j,false));
           
        }
    }

}
