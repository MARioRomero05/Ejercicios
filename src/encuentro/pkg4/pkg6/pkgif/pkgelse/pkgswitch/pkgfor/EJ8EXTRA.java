/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/** Escriba un programa que lea números enteros. Si el número es múltiplo
    de cinco debe detener la lectura y mostrar la cantidad de números
    leídos, la cantidad de números pares y la cantidad de números impares.
    Al igual que en el ejercicio anterior los números negativos no deben
    sumarse. Nota: recordar el uso de la sentencia break.
 *
 * @author Mario Romero
 */
public class EJ8EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numeros");
        int n;
        int contP=0, contI=0, cont=0;
        do {            
            n=read.nextInt();
            if (n>0) {
                cont=cont+1;
            }
            if (n%2==0) {
                contP=contP+1;
            } else {
                contI=contI+1;
            }
        } while (n%5!=0);
        System.out.println("Cantidad de numeros leidos: "+cont);
        System.out.println("Cantidad de numeros pares:"+contP);
        System.out.println("Cantidad de numeros impares:"+contI);
    }
}
