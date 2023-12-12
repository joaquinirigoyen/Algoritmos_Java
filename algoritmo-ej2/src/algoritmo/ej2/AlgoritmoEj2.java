/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,i,suma_impares;
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el numero 1");      
         num1 = leer.nextInt();
        System.out.println("ingrese el numero 2");
        num2 = leer.nextInt();
        suma_impares = 0;
        if (num1 == num2){
            System.out.println("los numeros 1 y 2 son iguales");
         }else 
            if (num1 < num2){
                for ( i = num1; i < num2; i++) {
                if ((i % 2==1)){
                    suma_impares = suma_impares + 1;
                }
            }}
              else
                 for (i = num2; i < num1; i++) {
                    if ((i % 2==1)){
                    suma_impares = suma_impares + 1;
                }    
                        }
        System.out.println("la suma de los impares entre el numero 1 y el 2 es de:" + suma_impares);
        


}   
}
        