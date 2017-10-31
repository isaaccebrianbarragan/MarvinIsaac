
package ex4traductor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Marvin Hernandez Lopez
 * @version 1.0 31.10.17
 */
public class Ex4Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); //clase scanner
        
        // Variables
        int opcion;
        String secuencia = "";
        String result = "";
        
        menu(); //muestra por consola el menu de opciones
        
        opcion = sc.nextInt(); //Recogemos el valor de la opcion
        
        //
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la secuencia de nucleotidos");
                secuencia = LeerSecuencia();
                if (nucleValido(secuencia)) {
                    result = translation(secuencia);
                    System.out.println("Secuencia de aminoacido:\n"+result);
                } else {
                    System.out.println("Error en la secuancia de nucleotidos");
                }
                break;
            case 2:
                System.out.println("Ingrese la secuencia de aminoacidos");
                secuencia = LeerSecuencia();
                if (aminoValido(secuencia)) {
                    result = ConverNucle(secuencia);
                } else {
                    System.out.println("Error en la secuancia de aminoacidos");
                }
                break;
            case 3:
                System.out.println("exit");
                
                break;    
            default:
                System.out.println("Opcion erronea");
        }
        
    }
    
    /**
     * Pinta todas las opciones de la aplicacion
     */
    public static void menu() {
        System.out.println("Selecionar una opcion:");
        System.out.println("1) Nucleotido a Aminoacido");
        System.out.println("2) Aminoacido a Nucleotido");
        System.out.println("3) Salir");
    }
    
    /**
     * Funcion que pide por introduscamos una secuencia.
     * @return String 
     */
    public static String LeerSecuencia(){
        String secuencia = "";
        Scanner sc=new Scanner(System.in);
        secuencia = sc.next();
    return secuencia;
    }
    
    /**
     * Comprueba que la cadena de entrada cumpla con los carateres de aminoacido
     * @param secuencia cadena de nucleotidos
     * @return boolean true si la cadena de nucleotidos es correcta
     */
    public static boolean nucleValido(String secuencia) {
        String nucleotidos = "ACGU"; // caracteres de los aminoacidos.
        boolean flag = true;
        secuencia = secuencia.toUpperCase(); // convertimos los caracteres a mayusculas
        
        for(char nucleotid : secuencia.toCharArray()) {
            if(!nucleotidos.contains(String.valueOf(nucleotid))) {
                flag = false;
                break;
            }
        }
        
        return flag;
    }

    /**
     * comprueba la cadena de entrada sea una secuencia de aminoacido valida
     * @param secuencia cadena de aminoacido
     * @return boolean debuelve true si cumple con los requisitos de aminoacido.
     */
    public static boolean aminoValido(String secuencia) {
        String aminoacidos = "DERKNHQSTAGVPLFYIMWC_"; // caracteres de los aminoacidos.
        boolean flag = true;
        secuencia = secuencia.toUpperCase(); // convertimos los caracteres a mayusculas
        
        for(char nucleotid : secuencia.toCharArray()) {
            if(!aminoacidos.contains(String.valueOf(nucleotid))) {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
    
    /**
     * 
     * @param secuencia
     * @return 
     */
    private static String ConverNucle(String secuencia) {
        String aminoacidos = "";
        
        
        return aminoacidos;
    }
    
    /**
     * Funcion que convierte una cadena de nucleotidos y la convierte a aminoacido
     * @param secuencia string de nucleotidos
     * @return String Cadena de aminoacidos.
     */
    public static String translation (String secuencia) {
    StringBuilder sb = new StringBuilder();
    secuencia = secuencia.toUpperCase();
    int i = 0;
    while (i <= secuencia.length() - 3) {
    //for (int i = 0; i < secuencia.length() - 2; i++) {
        String triplet = secuencia.substring(i, i+=3);

        switch (triplet) {
        case "UUU":
        case "UUC":
            sb.append("F");
            break;
        case "UUA":
        case "UUG":
        case "CUU":
        case "CUC":
        case "CUA":
        case "CUG":
            sb.append("L");
            break;
        case "AUU":
        case "AUC":
        case "AUA":
            sb.append("I");
            break;
        case "AUG":
            sb.append("M");
            break;
        case "GUU":
        case "GUC":
        case "GUA":
        case "GUG":
            sb.append("V");
            break;
        case "GAC":
        case "GAU":
            sb.append("D");
            break;
        case "GAA":
        case "GAG":
            sb.append("E");
            break;
        case "CGA":
        case "CGC":
        case "CGG":
        case "CGU":
        case "AGA":
        case "AGG":
            sb.append("R");
            break;
        case "AAA":
        case "AAG":
            sb.append("K");
            break;
        case "AAC":
        case "AAU":
            sb.append("N");
            break;
        case "CAC":
        case "CAU":
            sb.append("H");
            break;
        case "CAA":
        case "CAG":
            sb.append("Q");
            break;
        case "UCA":
        case "UCC":
        case "UCG":
        case "UCU":
        case "AGC":
        case "AGU":
            sb.append("S");
            break;
        case "ACA":
        case "ACC":
        case "ACG":
        case "ACU":
            sb.append("T");
            break;
        case "GCA":
        case "GCC":
        case "GCG":
        case "GCU":
            sb.append("A");
            break;
        case "GGA":
        case "GGC":
        case "GGG":
        case "GGU":
            sb.append("G");
            break;
        case "CCA":
        case "CCC":
        case "CCG":
        case "CCU":
            sb.append("P");
            break;
        case "UAC":
        case "UAU":
            sb.append("Y");
            break;
        case "UGG":
            sb.append("W");
            break;
        case "UGC":
        case "UGU":
            sb.append("C");
            break;
        case "UAA":
        case "UAG":
        case "UGA":
            sb.append("_");
            break;
            
        default:
            // nada;
        }           
    }       

    return sb.toString();
}

    
}
