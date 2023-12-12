/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej12;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,num_mayor;
        boolean continuar, primer_ingreso;
          Scanner leer = new Scanner (System.in);
          System.out.println("ingrese un numero");
          num = leer.nextInt();
          num_mayor = num;
          primer_ingreso = true;
          do {            
            if ((primer_ingreso == false)){
                System.out.println("ingrese un numero");
                num = leer.nextInt();
                
            }if ((num > num_mayor)){
                num_mayor = num;
                }
            primer_ingreso = false;
          System.out.println("desea ingresar otro numero?");
          continuar = leer.nextBoolean();
          } while (continuar == true);
    }
    
}
