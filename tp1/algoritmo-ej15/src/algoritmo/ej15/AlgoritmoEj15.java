/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej15;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad_unidades;
        float precio_unidad, precio_producto, descuento, pago_total;
        boolean continuar, etiqueta;
        Scanner leer = new Scanner (System.in);
            pago_total = 0;
            do {    
                System.out.println("ingrese el precio de la unidad");
                precio_unidad = leer.nextFloat();
                System.out.println("ingrese la cantidad de unidades que lleva de ese producto");
                cantidad_unidades = leer.nextInt();
                System.out.println("la etiqueta del producto es roja?");
                etiqueta = leer.nextBoolean();
                precio_producto = cantidad_unidades * precio_unidad;
                if ((etiqueta == false)) {
                    descuento = (precio_producto * 20)/100;
                    precio_producto = precio_producto-descuento;
                   }
                pago_total = pago_total + precio_producto;
                System.out.println("desea ingresar otro producto?");
                continuar = leer.nextBoolean();
            } while ((continuar == true));
            System.out.println("el total que debera abonar es de: $" + pago_total);
                 

    }
    
}
