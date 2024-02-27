
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class Teclado{
    
    private static StringTokenizer st;
    private static BufferedReader source;
    
    
    private Teclado() {}
   
     // Para leer un texto
    public static String leerPalabra() {
        return getNextToken();
    }
    
   // Para leer una linea de texto
    public static String leerLinea() {
        return getNextToken("\r\n\f");
    }
    
    // Para leer numero enteros de teclados
    public static int leerEntero() {
        return (int)leerEnteroLargo();
    }
    
   // Para leer numero enteros largos de teclados
    public static long leerEnteroLargo() {
        long retVal = 0;
        try {
            retVal = Long.parseLong(getNextToken());
        } catch (NumberFormatException e) {}
        return retVal;
    }
    
   
    public static float leerFloat() {
        return (float)leerDouble();
    }
    
   
    public static double leerDouble() {
        double retVal = 0.0;
        try {
            retVal = Double.valueOf(getNextToken()).doubleValue();
        } catch (NumberFormatException e) {}
        return retVal;
    }
    
   
    public static char leerCaracter() {
        char car = '\0';
        String str;
        
        str = getNextToken("\0");
        if (str.length() > 0) {
            car = str.charAt(0);
            st = new StringTokenizer(str.substring(1));
        }
        return car;
    }
   
    private static String getNextToken() {
        return getNextToken(null);
    }
    
    
    private static String getNextToken(String delim) {
        String input;
        String retVal = "";
        
        try {
            if ((st == null) || !st.hasMoreElements()) {
                if (source == null) {
                    source = new BufferedReader(new InputStreamReader(System.in));
                }
                input = source.readLine();
                st = new StringTokenizer(input);
            }
            if (delim == null) {
                delim = " \t\n\r\f";
            }
            retVal = st.nextToken(delim);
        } catch (NoSuchElementException e1) {
            // si ocurre una excepci�n, no hacer nada
        } catch (IOException e2) {
            // si ocurre una excepci�n, no hacer nada
        }
        
        return retVal;
    }
}