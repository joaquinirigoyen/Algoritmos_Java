/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej22;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, numerador , i;
        float calculo_posicion,resultado;
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        numerador = 1;
        resultado = 0;
        for ( i = 1; i < num; i++) {
            System.out.println("(" + numerador + "/" + 2 * i + ")"); 
            calculo_posicion = (numerador/(2*i));
            resultado = resultado + calculo_posicion;
            
        }
        System.out.println("el resultado final de la serie es:" + resultado);
    }
    
}
