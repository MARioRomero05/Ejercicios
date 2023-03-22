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
public class EJ8GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int note = 12;
        while (note<0 || note>10) {            
            System.out.println("Nota fuera de rango");
            System.out.println("Ingrese una nota entre 0 y 10");
            note = read.nextInt();
        }
    }
    
}
