/*
 * Classe Test que comprueba las diferentes funciones.
 */
package test;

import ex4traductor.Ex4Traductor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marvin Hernandez
 * @author 1.0 31.10.17
 */
public class Ex4traductorTest {
    
    public Ex4traductorTest() {
    }
    
    /**
     * Comprueba la funcion nucleValido ingresando los datos y comprobando el resultado.
     */
    @Test
    public void  validarNucleotidoTest() {
        Ex4Traductor result=new Ex4Traductor();
        boolean res= result.nucleValido("ACGU");
        assertEquals(true, res);  
    }
    
    /**
     * 
     */
    @Test
    public void  validarNucleotidoTest1() {
        Ex4Traductor result=new Ex4Traductor();
        boolean res= result.nucleValido("acgu");
        assertEquals(true, res);  
    }
    
    /**
     * Comprueba la funcion aminoValido ingresando los datos y comprobando el resultado.
     */
    @Test
    public void  validarAminoacidoTest() {
        Ex4Traductor result=new Ex4Traductor();
        boolean res= result.aminoValido("DER");
        assertEquals(true, res);  
    }
    
    /**
     * 
     */
    @Test
    public void  validarAminoacidoTest1() {
        Ex4Traductor result=new Ex4Traductor();
        boolean res= result.aminoValido("der");
        assertEquals(true, res);
    }
    
    /**
     * comprueba la conversion de nucleotido a aminoasido.
     */
    @Test
    public void  NucleToAmino() {
        Ex4Traductor result=new Ex4Traductor();
        String res= result.translation("uuu");
        assertEquals("F", res);
    }
    
    
    
}
