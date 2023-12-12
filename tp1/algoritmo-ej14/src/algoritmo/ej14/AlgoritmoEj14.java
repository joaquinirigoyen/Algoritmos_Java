/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej14;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad_unidades;
        float precio_unidad, precio_producto,pago_cliente,total_recaudado;
        boolean continuar, terminar;
         Scanner leer = new Scanner (System.in);
         total_recaudado = 0;
         do {    
             
            pago_cliente = 0;
           do {  
               System.out.println("ingrese el precio de la unidad");
               precio_unidad = leer.nextInt();
               System.out.println("ingrese la cantidad de unidades que lleva de ese producto");
               cantidad_unidades = leer.nextInt();
               precio_producto = precio_unidad * cantidad_unidades;
               pago_cliente = pago_cliente + precio_producto;
               System.out.println("desea ingresar otro producto???");
               continuar = leer.nextBoolean();
               
            
        } while ( continuar == true);
           
             System.out.println("el total que debera abonar el cliente es de: $" + pago_cliente);
             total_recaudado = total_recaudado + pago_cliente;
             System.out.println("desea terminar?");
             terminar = leer.nextBoolean();
           
            } while (terminar == false);
         System.out.println("el total de ventas recaudados es de: $" + total_recaudado);
                
    }
    
}
