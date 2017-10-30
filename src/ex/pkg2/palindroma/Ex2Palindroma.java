/*
 * Programa que pide al usuario una frase y nos muestra si es o
 * no palindroma teniendo en cuenta los espacio en blanco, los acentos
 *
 */
package ex.pkg2.palindroma;

import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author Marvin Hernandez
 * @version 2.0 25-10-17
 */
public class Ex2Palindroma {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);  //crear un objeto Scanner
        
        //variables
        String frase = "";
        
        System.out.println("Ingresa la frase:");
        frase = lector.nextLine();
        //System.out.println(frase);
        
        if (frase.length() > 2) {
            
            //fitra y limpia la cadena para su comprobacion.
            frase = quitarPunto(frase);
            frase = quitarEspacios(frase);        
            frase = limpiarAcentos(frase);
            
            //comprueba la cadena.
            if(esPalindromo(frase)){
                System.out.println("Palindromo");
            }
            else
            {
                System.out.println("No Palindromo");
            }
            
        } else {
            System.out.println("Frase no valida.");
        }
        
        
        
    }
    
    /**
     * Funcion que remueve los espacios de una frase
     * @param frase String con espacios
     * @return String cadena de caracteres sin espacios
     * 
     */
    public static String quitarEspacios(String frase){
        String cadena2="";
    //quitamos los espacios
    for (int x=0; x < frase.length(); x++) {
        if (frase.charAt(x) != ' ')
        cadena2 += frase.charAt(x);
    }

    return cadena2;
    }
    
    /**
     * Funcion que remueve los puntos y las comas (. , : ;)
     * @param frase String con puntos y comas.
     * @return String sin puntos y comas.
     */
    public static String quitarPunto(String frase){
        String cadena2="";
        //quitamos los punto, comas, doble punto, punto y coma.
        cadena2 = frase.replace(",","");
        cadena2 = cadena2.replace(".","");
        cadena2 = cadena2.replace(";","");
        cadena2 = cadena2.replace(":","");
        cadena2 = cadena2.replace("'","");
    
    return cadena2;
    }
    
    /**
     * Funcion que limpia la cadena quitando los acentos, dieresis, cedillas tildes ademas
     * remueve los caracteres no ASCII excepto la Ñ, interrogacion,exclamacion,grados y U con dieresis.
     * @param cadena
     * @return String 
     */
    public static String limpiarAcentos(String cadena) {
    String limpio =null;
    if (cadena !=null) {
        String valor = cadena;
        valor = valor.toUpperCase();
        // Normalizar texto para eliminar acentos, dieresis, cedillas y tildes
        limpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
        // Quitar caracteres no ASCII excepto la enie, interrogacion que abre, exclamacion que abre, grados, U con dieresis.
        limpio = limpio.replaceAll("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]", "");
        // Regresar a la forma compuesta, para poder comparar la enie con la tabla de valores
        limpio = Normalizer.normalize(limpio, Normalizer.Form.NFC);
    }
    return limpio;
    }
    
    /**
     * Funcion que comprueba si una frase es palindroma.
     * @param cadena String 
     * @return Boolean true si la frase es palindrima, false cuando no lo es.
     */
    public static boolean esPalindromo(String cadena){
        boolean valor=true;
        int i,ind;
        String cadena2="";
        
        ind=cadena.length();
        //comparamos cadenas
        for (i= 0 ;i < (cadena.length()); i++){
            if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
                //si una sola letra no corresponde no es un palindromo por tanto
                //sale del ciclo con valor false
                valor=false;
                break;
            }
            ind--;
        }
        return valor;
}
   
}
