package ex1;

import ex1.WordLetters;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Realiza el testeo unitario de las funciones de WordLetters.java
 * @author Isaac Cebrián Barragán
 * @version 1.0 2017-10-28
 */
@RunWith(Parameterized.class)
public class Ex1JUnitTest {
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"Isaac Cebrián Barragán","IsAAc cEbrIÁn bArrAgÁn",9,11}, 
            {"Marvin Josué Hernández López","mArvIn jOsUÉ hErnÁndEz lÓpEz",10,15},
            {"Susana Avila Montes","sUsAnA AvIlA mOntEs",8,9},
            {"Vicente Tomas Pulido Illana","vIcEntE tOmAs pUlIdO IllAnA",11,13},
            {"Hola a Todos","hOlA A tOdOs",5,5},
            {"aAaaeEaIIiOO UUuu","AAAAEEAIIIOO UUUU",16,0}, 
            {"Texto de test","tExtO dE tEst",4,7}
        });
    }
    
    private String input;
    private String expected;
    private int expectedNumberOfVowels;
    private int expectedNumberOfConsonants;
    
    public Ex1JUnitTest(String input, String expected, int expectedNumberOfVowels, int expectedNumberOfConsonants) {
        this.input = input;
        this.expected = expected;
        this.expectedNumberOfVowels = expectedNumberOfVowels;
        this.expectedNumberOfConsonants = expectedNumberOfConsonants;
    }
    
    /**
     * Validación de las funciones upperCase() & lowerCase().
     */
    @Test
    public void upperCaseVowelsAndLowerCaseConsonantsTest() {
        String result = WordLetters.upperCase(input, WordLetters.LOWER_CASE_VOWELS);
        result = WordLetters.lowerCase(result, WordLetters.LOWER_CASE_CONSONANTS.toUpperCase());
        assertEquals(expected, result);
    }
    
    /**
     * Validación de la función countLetters() para las vocales.
     */
    @Test
    public void countVowelsTest() {
        int result = WordLetters.countLetters(input.toLowerCase(), WordLetters.LOWER_CASE_VOWELS);
        assertEquals(expectedNumberOfVowels,result);
    }
    
    /**
     * Validación de la función countLetters() para las consonantes.
     */
    @Test
    public void countConsonantsTest() {
        int result = WordLetters.countLetters(input.toLowerCase(), WordLetters.LOWER_CASE_CONSONANTS);
        assertEquals(expectedNumberOfConsonants,result);
    }
}
