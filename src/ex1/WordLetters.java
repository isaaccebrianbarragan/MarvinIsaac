package ex1;

/**
 * Esta clase contiene todas las funciones necesarias para realizar el ejercício 1:
 *  1.- Desenvolupeu un programa que demani a l’usuari el seu nom i ens retorni 
 *  les vocals en majúscules i les consonants en minúsucles. A més a més ens 
 *  retornarà el recompte de cadascuna de les vocals i consonants que hi conté 
 *  (nombre d' a’s, d' e’s, etc.).
 * @author Isaac Cebrián Barragán
 * @version 1.0 2017-10-28
 */ 
public abstract class WordLetters {
    /**
     * Contiene todas las vocales en minúscula con sus distintos signos de acentuación.
     */
    public static final String LOWER_CASE_VOWELS = "aàáâäeèéêëiìíîïoòóôöuùúûü";
    /**
     * Contiene todas las consonantes en minúscula.
     */
    public static final String LOWER_CASE_CONSONANTS = "bcdfghjklmnñpqrstvwxyz";
    
    /**
     * Cuenta el número de letras dadas por parametros que se encuentran en el texto dado por parámetros.
     * @param text String texto a analizar.
     * @param letters String Cadena de letras que se quieren convertir a minuscula.
     * @return int Número de letras coincidentes que contiene el texto.
     */
    public static int countLetters(String text, String letters) {
        int count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(letters.toLowerCase().contains(String.valueOf(text.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Convierte en mayúscula todas las letras recividas por parámetro.
     * @param text String Texto a convertir.
     * @param letters String Cadena de letras que se quieren convertir a mayúscula.
     * @return String Texto convertido.
     */
    public static String upperCase(String text, String letters) {
        String resultText = "";
        for(int i = 0; i < text.length(); i++) {
            if(letters.indexOf(text.charAt(i)) != -1) {
                resultText += Character.toUpperCase(text.charAt(i));
            } else {
                resultText += text.charAt(i);
            }
        }
        return resultText;
    }
    
    /**
     * Convierte en minuscula todas las letras recividas por parámetro.
     * @param text String Texto a convertir.
     * @param letters String Cadena de letras que se quieren convertir a minuscula.
     * @return String Texto convertido.
     */
    public static String lowerCase(String text, String letters) {
        String resultText = "";
        for(int i = 0; i < text.length(); i++) {
            if(letters.indexOf(text.charAt(i)) != -1) {
                resultText += Character.toLowerCase(text.charAt(i));
            } else {
                resultText += text.charAt(i);
            }
        }
        return resultText;
    }
}
