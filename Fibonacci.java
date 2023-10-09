
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author richard
 */
public class Fibonacci {

    
    public static void main(String[] args) {
         int cero=0, uno=1, fibonacci;  
       
        System.out.println(" FIBONACCI ");
        
        Scanner nTerminos = new Scanner (System.in);       
        System.out.println("Ingresa los N-terminos que desea ver ");
        int NTermino = nTerminos.nextInt();
        nTerminos.close();
       
        System.out.println("La Serie Fibonacci  esta compuesta de   "+NTermino+" numeros que son :");              
       
        
        for (int i = 1; i < NTermino; i++) {
        System.out.println(cero);
        
        fibonacci = cero + uno; 
        cero = uno;
        uno = fibonacci;
        }
    }
}
    
    

