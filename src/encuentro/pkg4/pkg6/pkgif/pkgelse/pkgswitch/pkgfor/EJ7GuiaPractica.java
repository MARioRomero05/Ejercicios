/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.pkg6.pkgif.pkgelse.pkgswitch.pkgfor;

import java.util.Scanner;

/** Realizar un programa que simule el funcionamiento de un dispositivo
    RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
    cadenas deben llegar con un formato fijo: tienen que ser de un máximo
    de 5 caracteres de largo, el primer carácter tiene que ser X y el último
    tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas,
    la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
    FDE), y toda secuencia distinta de FDE, que no respete el formato se
    considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de
    lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
    deberá investigar cómo se utilizan las siguientes funciones de Java
    Substring(), Length(), equals().
 *
 * @author Mario Romero
 */
public class EJ7GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String cadena;
        int good=0;
        int bad=0;
        System.out.println("Ingrese cadenas de texto cadenas de texto para inicar el dispositivo RS232");
        do {
            cadena=read.next();
            cadena=cadena.toUpperCase();
            if (cadena.startsWith("x") && cadena.endsWith("o") && cadena.length()==5) {
                good=good+1;
            } else {
                bad=bad+1;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("Entradas correctas: "+good);
        System.out.println("Entradas incorrectas: "+bad);
    }
    
}
