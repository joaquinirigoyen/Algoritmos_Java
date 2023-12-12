/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

/**
 *
 * @author user
 */
public class testperro {
     public static void main(String[] args) {
         //muestro 3 perros
         perro perro1 = new perro ("rotwellier","negro");
         System.out.println(perro1.toString());
          perro perro2 = new perro ("pastor aleman"," negro y marron");
         System.out.println(perro2.toString());
          perro perro3 = new perro ("pitbull","blanco");
         System.out.println(perro3.toString());
         System.out.println("");
         perro1.setcolor("verde");
          System.out.println(perro1.toString());
             System.out.println(perro2.toString());
              System.out.println(perro3.toString());
         
     }
}
