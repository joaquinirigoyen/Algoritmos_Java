/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej13;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,num_menor;
        boolean continuar, primer_ingreso;
          Scanner leer = new Scanner (System.in);
          System.out.println("ingrese un numero");
          num = leer.nextInt();
          num_menor = num;
          primer_ingreso = true;
          do {            
            if ((primer_ingreso == false)){
                System.out.println("ingrese un numero");
                num = leer.nextInt();
                
            }
            if ((num < num_menor)){
                num_menor = num;
                }
            primer_ingreso = false;
          System.out.println("desea ingresar otro numero?");
          continuar = leer.nextBoolean();
          } while (continuar == true);
          System.out.println("el menor numero ingresado fue:" + num_menor);
        
    }
    
}
