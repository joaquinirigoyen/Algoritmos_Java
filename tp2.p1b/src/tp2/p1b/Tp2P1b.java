/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.p1b;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class Tp2P1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cotizacion ,dolar;
        boolean continuar;
        do {
         System.out.println("ingrese la cantidad de dolares que quiere cotizar");
        dolar = TecladoIn.readDouble();
        System.out.println("ingrese la cotizacion del dolar:");
        cotizacion = TecladoIn.readDouble();
        System.out.println("el monto en pesos es de:" + resultado (cotizacion,dolar));
            System.out.println("desea ingressar otro monto?");
            continuar = TecladoIn.readLineBoolean();
         } while (continuar == true);
    }
    public static double resultado (double dolar1, double cotizacion1){
        double res = dolar1 * cotizacion1;
        return res;
    }
            
}
