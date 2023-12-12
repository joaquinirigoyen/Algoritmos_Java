/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej8;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, ingresos,suma_ingresos;
        float prom; 
         Scanner leer = new Scanner (System.in);
         suma_ingresos = 0;
         ingresos = 0;
         System.out.println("ingrese un numero");
         num = leer.nextInt();
         do {            
            ingresos = ingresos + 1;
            suma_ingresos = suma_ingresos + num;
            System.out.println("ingrese un numero");
            num = leer.nextInt();
         }while (num > 0);
         
         prom = suma_ingresos/ingresos;
         System.out.println("el promedio de los numeros ingresados hasta que ingreso un numero negativo es:" + prom);
         
    }
    
}
