/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num;
        int contador = 0;
        System.out.println("Ingrese el numero");
        num = entrada.nextInt();
        if ((num > 0) && (num % 2 == 0)) {
            while (contador < num) {
                contador = contador + 1;
                System.out.printf("%d  ", contador);
                
            }
        } else {
            System.out.println("ERROR, el numero ingresado es negativo o impar");
        }
    }

}
