/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.p2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tp2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     int num,acum = 0;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
       acum = entendi(num);
          }
    public static int entendi(int num1 ){ //use este xq fue de la forma q me explicaron jejej
         int acum1;
         acum1 = 0;
        for (int i = 1; i <= num1; i++) {
          acum1 = acum1 + i;  
        }
        System.out.println("el resultado es:" + acum1 );
        return acum1;
    }
    
}
