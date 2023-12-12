  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,i ,pares;
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el numero 1");
        num1 = leer.nextInt();
        System.out.println("ingrese el numero 2");
        num2 = leer.nextInt();
        pares = 0;
        if (num1 == num2){
            System.out.println("los numeros 1 y 2 son iguales");
        } else 
            if (num1 < num2){
             for (i = num1; i < num2; i++){
                if (( i % 2)==0){
                    pares = pares + 1; 
                }
                
            }
            
           } else 
                for (i = num2; i < num1; i++){
                  if (( i % 2)==0){
                    pares = pares + 1; 
                     }
                     }
    System.out.println("la cantidad de pares entre los numeros 1 y 2 es de:"+pares);
        
                     }
                     }


