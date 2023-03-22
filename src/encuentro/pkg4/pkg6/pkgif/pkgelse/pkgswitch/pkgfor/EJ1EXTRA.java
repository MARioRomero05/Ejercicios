/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/** Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
    ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
    equivalente: 1 día, 2 horas.
 *
 * @author Mario Romero
 */
public class EJ1EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos: ");
        int min=read.nextInt();
        int horas=min/60;
        int hs=horas%24;
        int days=horas/24;
        System.out.println("Sus "+ min + " minutos equivalen a: "+ days + " dias y " + hs + "horas");
    }
    
}
