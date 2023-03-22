/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera
    letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
    imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
    contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
    Substring y equals() de Java.
 * @author Mario Romero
 */
public class EJ4GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String phrase = read.nextLine();
        phrase = phrase.toLowerCase();
        if (phrase.substring(0,1).equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
