/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/** Realice un programa que calcule y visualice el valor máximo, el valor
    mínimo y el promedio de n números (n>0). El valor de n se solicitará al
    principio del programa y los números serán introducidos por el usuario.
    Realice dos versiones del programa, una usando el bucle “while” y otra
    con el bucle “do - while”.
 *
 * @author Mario Romero
 */
public class EJ7EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int cant=read.nextInt();
        int cont=cant;
        int n, max, min;
        double suma;
        max=0;
        min=9999;
        suma=0;
        while (cont>0) {            
            System.out.println("Ingrese los numeros:");
            n=read.nextInt();
            cont=cont-1;
            if (n>max) {
                max=n;
            }
            if (n<min) {
                min=n;
            }
            suma+=n;
        }
        System.out.println("El numero maximo es: " + max + " El numero minimo es: " + min + " y el promedio es:" + suma/cant);
    }
    
}
