/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author user
 */
public class testauto {
     public static void main(String[] args) {
         //muestro 3 autos
         auto auto1 = new auto ("rojo","fiat",96 );
         System.out.println(auto1.toString());
         auto auto2 = new auto ("blanco","renault",2001 );
         System.out.println(auto2.toString());
         auto auto3 = new auto ("azul","vw",99 );
         System.out.println(auto3.toString());
           System.out.println("");
           auto3.setcolor("gris");
            System.out.println(auto1.toString());
             System.out.println(auto2.toString());
              System.out.println(auto3.toString());
     }
}
