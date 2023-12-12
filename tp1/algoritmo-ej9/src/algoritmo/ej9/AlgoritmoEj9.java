/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej9;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numM,numN,productoria, i;
      Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero para m");
        numM = leer.nextInt();
        System.out.println("ingrese otro numero para n");
        numN = leer.nextInt();
        productoria = 1;
        if (numM == numN){
            System.out.println("los numeros n y m son iguales");
          }else
                for ( i = numM; i < numN;i++) {
                     productoria = productoria * i;
                
        }
             
        System.out.println("la productoria entre los numeros n y m es de:" + productoria);
        
        
    }
    
}
