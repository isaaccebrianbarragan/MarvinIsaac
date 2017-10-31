/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ex.pkg2.palindroma.Ex2Palindroma;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marvin Hernandez
 * @version 1.0 31.10.17
 */
public class palindromoTest {
    
    public palindromoTest() {
    }
    
            
    @Test
    public void  puntoTest() {
        Ex2Palindroma result=new Ex2Palindroma();
        String res= result.quitarPunto("h.o,l;a");
        assertEquals("hola", res);
    }
    
    @Test
    public void  espaciosTest() {
        Ex2Palindroma result=new Ex2Palindroma();
        String res= result.quitarEspacios("h o l a");
        assertEquals("hola", res);
    }
    
    @Test
    public void  limpiarTest() {
        Ex2Palindroma result=new Ex2Palindroma();
        String res= result.limpiarAcentos("hólà");
        assertEquals("HOLA", res);
    }
    
    @Test
    public void  palindromaTest() {
        Ex2Palindroma result=new Ex2Palindroma();
        boolean res= result.esPalindromo("ojo");
        assertEquals(true, res);
    }
}
