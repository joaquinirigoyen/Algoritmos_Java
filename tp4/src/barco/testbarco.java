/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barco;

/**
 *
 * @author user
 */
public class testbarco {
     public static void main(String[] args) {
         //muestro 3 barcos
         barco barco1 = new barco (2003,"russia");
         System.out.println(barco1.toString());
          barco barco2 = new barco (95,"eeu");
         System.out.println(barco2.toString());
          barco barco3 = new barco (2010,"polonia");
         System.out.println(barco3.toString());
         System.out.println("");
         barco2.setaño(2011);
          System.out.println(barco1.toString());
             System.out.println(barco2.toString());
              System.out.println(barco3.toString());
         
     }
}
