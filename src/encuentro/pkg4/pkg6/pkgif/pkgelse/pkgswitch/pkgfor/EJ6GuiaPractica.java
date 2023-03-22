/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/** Realizar un programa que pida dos números enteros positivos por
    teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
    una opción y el programa deberá mostrar el resultado por pantalla y
    luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
    vez de salir del programa directamente, se debe mostrar el siguiente
    mensaje de confirmación: ¿Está seguro que desea salir del programa
    (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
    contrario se vuelve a mostrar el menú.
 *
 * @author Mario Romero
 */
public class EJ6GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros positivos");
        int num1=read.nextInt();
        int num2=read.nextInt();
        int opt;
        int operation;
        String option="";
        do {            
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija la opcion"); 
            opt=read.nextInt();
            switch (opt){
                case 1:
                   operation=num1+num2;
                   System.out.println("La suma de sus numeros es: "+operation);
                   break;
                case 2:  
                   operation=num1-num2;
                   System.out.println("La resta de sus numeros es: "+operation);
                   break;
                case 3:
                   operation=num1*num2;
                   System.out.println("La multiplicacion de sus numeros es: "+operation);
                   break;
                case 4:
                   operation=num1/num2;
                   System.out.println("La division de sus numeros es: "+operation);
                   break;
                case 5:
                   System.out.println("Esta seguro que desea salir? S/N");
                   option=read.next();
                   option=option.toUpperCase();
                    if (option.equalsIgnoreCase("s")) {
                        break;
                    } else {
                        continue;
                    }
                default:
                    System.out.println("Opcion erronea"); 
            } 
        }while (!option.equalsIgnoreCase("s"));// cuando se antesede una condicion o una exprecion con un signo "!" significa que esta esta negada , es decir que significa lo contrario.
    }  
}
