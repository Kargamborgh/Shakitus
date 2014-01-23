/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shakitus.shakitus;

import Logiikka.*;
import Logiikka.nappulat.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kargamborgh
 */
public class ShakitusTest {
    
    public ShakitusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void peliLuodaan() {
        Peli peli = new Peli();
        
        assertNotNull("Peli on luotu",peli);
    }
    
    @Test
    public void peliLautaLuodaan() {
        Pelilauta pelilauta = new Pelilauta();
        
        assertNotNull("Pelilauta on luotu",pelilauta);
    }
    @Test
    public void SotilaitaLuodaan() {
        Sotilas sotilas = new Sotilas(1,1,true);
        
        assertNotNull("Sotilaita on olemassa",sotilas);
    }
    
    @Test
    public void tornejaLuodaan() {
        Torni torni = new Torni(0,0,true);
        
        assertNotNull("Torneja on olemassa",torni);
    }
    
    @Test
    public void sijaintiOnOlemassa() {
        Sijainti sijainti = new Sijainti(1,1);
        
        assertNotNull("Sijainti on olemassa",sijainti);
    }
    
}
