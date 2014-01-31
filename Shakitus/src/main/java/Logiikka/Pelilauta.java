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

    private int x;
    private int y;
    private char[][] lauta;
    private ArrayList<Nappula> valkoiset;
    private ArrayList<Nappula> mustat;

    public Pelilauta() {
        this.x = 8;
        this.y = 8; //purkkaviritys ":D"
        lauta = new char[x][y]; 
        //tarkoitus tehdä kaksiulotteinen taulukko pelilaudan ruuduista

        for (int rivi = 0; rivi < 8; rivi++) {
            for (int sarake = 0; sarake < 8; sarake++) {
                lauta[rivi][sarake] = (char) ('0' + rivi * 8 + sarake); 
            }
        }
    }

    public void tulostaLauta() {
        for (int rivi = 0; rivi < 8; rivi++) {
            for (int sarake = 0; sarake < 8; sarake++) {
                System.out.print(lauta[rivi][sarake]);    
                   if (sarake == 7) System.out.println();
                
            }
        }
    }
    
    public void luoNappulat() {
        
        valkoiset = new ArrayList<Nappula>();
        mustat = new ArrayList<Nappula>();
        
        for (Nappula n : valkoiset) {
            for (int i = 0; i <= 7; i++) {
                int j = 1;
                n = new Sotilas(i,j,true);
                valkoiset.add(n);
                System.out.println(n);
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
                n = new Sotilas(i,j,false);
                mustat.add(n);
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
    
    public void tulostaNappulat() {
            for (Nappula n : valkoiset) {
                n.tulostaNappula();
            }
            for (Nappula n : mustat) {
                n.tulostaNappula();
            }
        } 
    }


