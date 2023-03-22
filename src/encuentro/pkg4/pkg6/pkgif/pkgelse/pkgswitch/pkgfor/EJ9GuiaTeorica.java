/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/**
 *  Escriba un programa que lea 20 números. Si el número leído es igual a cero se
    debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
    programa deberá calcular y mostrar el resultado de la suma de los números
    leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
    de la sentencia break.
 * @author Mario Romero
 */
public class EJ9GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int sum=0;
        int cont=1;
        do {            
            System.out.println("Ingrese numeros");
            num = read.nextInt();
            if (num>0) {
                sum=sum+num;
                cont=cont+1; 
            } else {
                cont=cont+1;
            }
            if (num==0) {
                System.out.println("Se encontro el numero 0");
                break;
            } 
        } while (cont<20);
        System.out.println("La suma de los numeros ingresados es: "+ sum);
    }
}
    
