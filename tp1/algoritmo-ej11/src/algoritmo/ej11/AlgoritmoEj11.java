/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej11;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        float cantidad_kilos, precio_kilo, precio_total,precio_descuento, ganancia;
            Scanner leer = new Scanner (System.in);
            System.out.println("ingrese el precio por kilo de naranjas");
            precio_kilo =  leer.nextInt();
            ganancia = 0;
            for ( i = 1; i < 15; i++) {
                System.out.println("ingrese la cantidad de kilos que compro");
                cantidad_kilos =  leer.nextInt();
                precio_total = precio_kilo * cantidad_kilos;
                if (cantidad_kilos > 10){
                    precio_descuento = (precio_total * 15)/100;
                    precio_total = precio_total - precio_descuento;
                }
                System.out.println("el cliente debera pagar:" + precio_total);
                ganancia = ganancia + precio_total;
            }
              System.out.println("la ganancia total de la tienda es de: $" + ganancia);
            
    }
    
}
