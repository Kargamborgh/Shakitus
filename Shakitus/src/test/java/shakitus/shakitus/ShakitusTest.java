/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shakitus.shakitus;

import Logiikka.*;
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
    
    
}
