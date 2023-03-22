/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/**Crear un programa que pida una frase y si esa frase es igual a “eureka” el
    programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
    Incorrecto. Nota: investigar la función equals() en Java.
 *
 * @author Mario Romero
 */
public class EJ2GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String phrase = read.next();
        phrase = phrase.toLowerCase();
        if (phrase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");    
    }
}
}
