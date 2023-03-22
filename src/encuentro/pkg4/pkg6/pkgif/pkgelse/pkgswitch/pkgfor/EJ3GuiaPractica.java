/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras
    de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
    deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
    caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
    función Lenght() en Java.
 * @author Mario Romero
 */
public class EJ3GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String phrase = read.nextLine();
        if (phrase.length()==8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
