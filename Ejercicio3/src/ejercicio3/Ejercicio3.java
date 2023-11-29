/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int multiplicando;
        int multiplicador;
        int suma = 0;
        System.out.println("Ingrese el multiplicando");
        multiplicando = entrada.nextInt();
        System.out.println("Ingrese el multiplicador");
        multiplicador = entrada.nextInt();
        do {
            multiplicando = multiplicando * 2;
            multiplicador = multiplicador / 2;
            if (multiplicador % 2 == 1) {
                suma = suma + multiplicando;
            }
        } while (multiplicador >= 1);
        {
            System.out.printf("El resultado final es: %d\n", suma);
        }
    }

}
