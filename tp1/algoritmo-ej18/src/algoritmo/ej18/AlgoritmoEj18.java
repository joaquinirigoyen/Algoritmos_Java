/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej18;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cliente;
        float monto_cliente, total_ventas;
        boolean continuar;
        Scanner leer = new Scanner (System.in);
          cliente = 0;
          total_ventas = 0;
          do {      
              System.out.println("ingrese el monto total del cliente");
              monto_cliente = leer.nextInt();
              cliente = cliente + 1;
              total_ventas = total_ventas + monto_cliente;
              System.out.println("desea ingresar el monto total de otro cliente?");
              continuar = leer.nextBoolean();
            
        } while (continuar == true);
          System.out.println("la cantidad de clientes atendidos es de:" + cliente);
          System.out.println("el monto total de las ventas es de: $" + total_ventas);
    }
    
}
