/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu3;

import java.util.Scanner;

/**
 *
 * @author Jazzi :) 
 */
public class ExamenU3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio = 0;
        int opcion;
        
        do {

            System.out.println("1. Capuchino--Ch:25.30, M:30, G:37.5 ");
            System.out.println("2. Latte-- Ch:32.50, M:38.40, G:42.50 ");
            System.out.println("3. Matcha-- Ch:41.50, M:48.90, G:52.5 ");
            System.out.println("4. Salir");
            
            System.out.println("Elige un cafe: ");
            opcion = scanner.nextInt();
            String cafe = "";

            if (opcion == 1){
                cafe = "capuchino";
            } else if (opcion == 2) {
                cafe = "late";
            } else if (opcion == 3) {
                cafe = "matcha";
            }

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("De que tamanio quiere su cafe?");
                    System.out.println("1. CH");
                    System.out.println("2. M");
                    System.out.println("3. G");
                    String tamanio = scanner.nextLine();

                    if (tamanio.equalsIgnoreCase("CH")) {
                        precio = 25.30;
                    } else if (tamanio.equalsIgnoreCase("M")) {
                        precio = 30.00;
                    } else {
                        precio = 37.5;
                    }

                    System.out.println("Que tipo de leche quiere? ");
                    System.out.println("Deslactosada");
                    System.out.println("Normal");
                    String tipoleche = scanner.nextLine();

                    if (tipoleche.equals("deslactosada")) {
                        System.out.println("entra al if");
                        precio += 12;
                    }

                    System.out.println("cafe comprado: " + cafe);
                    System.out.println("tipo de leche: " + tipoleche);
                    System.out.println("total cuenta: " + precio);

                    break;
                case 2:
                     System.out.println("De que tamanio quiere su cafe?");
                    System.out.println("1. CH");
                    System.out.println("2. M");
                    System.out.println("3. G");
                    String tamanio2 = scanner.nextLine();

                    if (tamanio2.equalsIgnoreCase("CH")) {
                        precio = 32.5;
                    } else if (tamanio2.equalsIgnoreCase("M")) {
                        precio = 38.4;
                    } else {
                        precio = 42.5;
                    }

                    System.out.println("Que tipo de leche quiere? ");
                    System.out.println("Deslactosada");
                    System.out.println("Normal");
                    String tipoleche2 = scanner.nextLine();

                    if (tipoleche2.equals("deslactosada")) {
                        System.out.println("entra al if");
                        precio += 12;
                    }

                    System.out.println("cafe comprado: " + cafe);
                    System.out.println("tipo de leche: " + tipoleche2);
                    System.out.println("total cuenta: " + precio);
                    break;
                case 3:
                     System.out.println("De que tamanio quiere su cafe?");
                    System.out.println("1. CH");
                    System.out.println("2. M");
                    System.out.println("3. G");
                    String tamanio3 = scanner.nextLine();

                    if (tamanio3.equalsIgnoreCase("CH")) {
                        precio = 41.5;
                    } else if (tamanio3.equalsIgnoreCase("M")) {
                        precio = 48.9;
                    } else {
                        precio = 52.5;
                    }

                    System.out.println("Que tipo de leche quiere? ");
                    System.out.println("Deslactosada");
                    System.out.println("Normal");
                    String tipoleche3 = scanner.nextLine();

                    if (tipoleche3.equals("deslactosada")) {
                        System.out.println("entra al if");
                        precio += 12;
                    }

                    System.out.println("cafe comprado: " + cafe);
                    System.out.println("tipo de leche: " + tipoleche3);
                    System.out.println("total cuenta: " + precio);
                    break;
                case 4:
                    System.out.println("Gracias por usar el menu");
                    break;

                default:
                    System.out.println("opcion no valida");
            }

        } while (opcion != 4);
    }

}