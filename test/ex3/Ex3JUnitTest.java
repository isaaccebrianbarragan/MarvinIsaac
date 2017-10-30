package ex3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ex3.Ex3;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Administrador
 */
@RunWith(Parameterized.class)
public class Ex3JUnitTest {
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"acgt","acgu"},
            {"asfacctgcgaaaaa",""},
            {"aaactacgatcgtactaggaga","aaacuacgaucguacuaggaga"},
            {"aaaaccacatgatattcgtagca","aaaaccacaugauauucguagca"},
            {"aacacagtcgatgstfatgctRR",""},
            {"ACGT","acgu"}
        });
    }
    
    private String adn;
    private String arn;
    
    public Ex3JUnitTest(String adn, String arn) {
        this.adn = adn;
        this.arn = arn;
    }

    /**
     * Validación de la función adnToArn().
     */
    @Test
    public void adnToArnTest() {
        String result = Ex3.adnToArn(adn);
        assertEquals(arn.toLowerCase(), result);
    }
    
    /**
     * Validación de la función arnToAdn().
     */
    @Test
    public void arnToAdnTest() {
        String result = Ex3.arnToAdn(arn);
        String expected = "";
        if(!arn.isEmpty()) {
           expected = adn;
        }
        assertEquals(expected.toLowerCase(), result);
    }
}
