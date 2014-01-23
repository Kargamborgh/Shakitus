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
public class Pelilauta {
    
    private char[][] lauta;
    
    public Pelilauta() {
        
       for (int rivi = 0; rivi < 7; rivi++) {
           for (int sarake = 0; sarake < 7; sarake++) {
               lauta[rivi][sarake] = (char) ('1' + rivi * 7 + sarake);
           }
       }
    }
       public void tulostaLauta() {
           for (int rivi = 0; rivi < 7; rivi++) {
               for (int sarake = 0; sarake < 7; sarake++) {
                   System.out.println(lauta[rivi][sarake]);
               }
           }
       }
        
    }

