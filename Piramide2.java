
package piramide2;

import java.util.Scanner;


public class Piramide2 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de filas que desea ver ");
        Scanner nfilas=new Scanner(System.in);
        int n = nfilas.nextInt();
        char letra = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(letra);
                letra++;
            }
            System.out.println();
        }
    }
}
    


