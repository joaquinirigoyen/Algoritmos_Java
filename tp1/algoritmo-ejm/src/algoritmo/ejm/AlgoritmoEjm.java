/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ejm;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEjm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i,j,num,matriz,filas,columnas;
      Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la cantidad de columnas");
        columnas = leer.nextInt();
        System.out.println("ingrese la cantidad dde filas");
        filas = leer.nextInt();
        matriz = filas + columnas;
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < 10; j++) {
                System.out.println("ingrese el numero para la fila" + i + "columa" + j);
                num = leer.nextInt();
                matriz[i,j] = num;
            }
            
        }
    }
    
}
