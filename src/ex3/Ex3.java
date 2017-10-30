package ex3;

/**
 * Esta clase contiene todas las funciones necesarias para realizar el ejercício 1:
 *  3.- Programa que, a partir d’una seqüència d'ADN, calcula la seqüència ARN i 
 *  viceversa.  Se’ns deixa escollir què volem mitjançant un petit menú.
 * @author Isaac Cebrián Barragán
 * @version 1.0 2017-10-29
 */
public abstract class Ex3 {
    /**
     * Contiene todas las letras referidas al ADN (a,c,g,t) en minúscula.
     */
    public static final String ADN = "acgt";
    /**
     * Contiene todas las letras referidas al ARN (a,c,g,u) en minúscula.
     */
    public static final String ARN = "acgu";
    
    /**
     * Convierte la cadena de ADN recibida por parametros (ya sea en mayúscula o en minúscula) a su correspondiente cadena ARN.
     * @param adn String Cadena a convertir.
     * @return String Cadena vacía en caso de que la cadena origen de ADN no sea valida, en caso de que sea valida devolverá su correspondiente cadena de ARN. 
     */
    public static String adnToArn(String adn) {
        adn = adn.toLowerCase();
        String arn = "";
        if(isADN(adn)) {
            for(char nucleotid : adn.toCharArray()) {
                arn += String.valueOf(ARN.charAt(ADN.indexOf(nucleotid)));
            }
        }
        return arn;
    }
    
    /**
     * Convierte la cadena de ARN recibida por parametros (ya sea en mayúscula o en minúscula) a su correspondiente cadena ADN.
     * @param arn String Cadena a convertir.
     * @return String Cadena vacía en caso de que la cadena origen de ARN no sea valida, en caso de que sea valida devolverá su correspondiente cadena de ADN. 
     */
    public static String arnToAdn(String arn) {
        arn = arn.toLowerCase();
        String adn = "";
        if(isARN(arn)) {
            for(char nucleotid : arn.toCharArray()) {
                adn += String.valueOf(ADN.charAt(ARN.indexOf(nucleotid)));
            }
        }
        return adn;
    }
    
    /**
     * Valida si la cadena recibida por parámetros (ya sea en mayúscula o en minúscula) es de ADN.
     * @param adn String Cadena a validar.
     * @return boolean Verdadero en caso de que la cadena contenga solo caracteres de ADN. Falso en caso en que la cantena contenga uno o mas caracteres que no sean de ADN.
     */
    public static boolean isADN(String adn) {
        adn = adn.toLowerCase();
        boolean isADN = true;
        for(char nucleotid : adn.toCharArray()) {
            if(!ADN.contains(String.valueOf(nucleotid))) {
                isADN = false;
                break;
            }
        }
        return isADN;
    }
    
    /**
     * Valida si la cadena recibida por parámetros (ya sea en mayúscula o en minúscula) es de ARN.
     * @param arn String Cadena a validar.
     * @return boolean Verdadero en caso de que la cadena contenga solo caracteres de ARN. Falso en caso en que la cantena contenga uno o mas caracteres que no sean de ARN.
     */
    public static boolean isARN(String arn) {
        arn = arn.toLowerCase();
        boolean isARN = true;
        for(char nucleotid : arn.toCharArray()) {
            if(!ARN.contains(String.valueOf(nucleotid))) {
                isARN = false;
                break;
            }
        }
        return isARN;
    }
    
}
