/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/**
 *
 * @author Mario Romero
 */
public class EJ6GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println("Uno o ambos números son mayores que 25");
        }else {
            System.out.println("Ninguno de los números es mayor que 25");
        }
    }
    }
    
