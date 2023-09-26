
package practica1;
import java.util.Scanner;

public class Practica1 {

    
    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        int n;
        System.out.println("Digite un numero ");
        n= leer.nextInt();
        if (n%2 ==0 ){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
    
}

