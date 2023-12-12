/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.pkg1;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class Tp21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cotizacion,dolar;
        System.out.println("ingrese la cantidad de dolares que quiere cotizar");
        dolar = TecladoIn.readDouble();
        System.out.println("ingrese la cotizacion del dolar:");
        cotizacion = TecladoIn.readDouble();
        double resultado;
        resultado = conversor(dolar,cotizacion);
        System.out.println("el resultado es:" + resultado);
    }
    public static double conversor(double dolar1, double cotizacion1) { //utilice este modulo porq realiza la conversion del dolar
        
        double resultado = dolar1*cotizacion1;
         return  resultado;
    }
    
    
}

