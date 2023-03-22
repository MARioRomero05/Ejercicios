/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/** Escriba un programa en el cual se ingrese un valor límite positivo, y a
    continuación solicite números al usuario hasta que la suma de los
    numeros introducidos supere el límite inicial.
 *
 * @author Mario Romero
 */
public class EJ5GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor limite: ");
        int limite = read.nextInt();
        int num;
        int suma=0;
        do {            
            System.out.println("ingrese numeros");
            num=read.nextInt();
            suma+=num;
        } while (suma<=limite);
        System.out.println("Supero su limite.");
    }
}
