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
public class EJ8GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el numero para armar el cuadrado de asteriscos");
        int num = read.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j==1 || j==num || i==1 || i==num) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");    
                        }
            } System.out.println("");  
        }
    }
    
}
