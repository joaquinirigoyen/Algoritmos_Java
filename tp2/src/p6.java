/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.p6;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class Tp2P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        double monto,categoria;
        boolean continuar;
        String nombre;
        do {            
        System.out.println("ingresar nombre del empleado:");
        nombre = TecladoIn.readLineWord();
        System.out.println("ingresar numero de empleado:");
        num = TecladoIn.readInt();
        System.out.println("ingresar monto que tiene que pagar");
        monto = TecladoIn.readDouble();
        System.out.println("ingresar categoria que es el empleado: (1),(2),(3),(4)");
        categoria = TecladoIn.readDouble();
        double resultado = descuento (monto,categoria);
        System.out.println("el descuento realizado es de:" + resultado);
        System.out.println("desea ingresar otro empleado?");
        continuar = TecladoIn.readLineBoolean();
         } while (continuar == true);
    }

  
    public static double descuento (double monto1,double categoria1) { //use este para elegir las categorias
double resultado;
resultado = 0;
if (categoria1 == 1 ){ 
    resultado = (monto1 * 7)/100;
}else
    if (categoria1 == 2){
        resultado = (monto1 * 18.5)/100;
    }else
        if (categoria1 == 3){
           resultado = (monto1 * 10)/100;
         }else
             if (categoria1 == 4){
                 resultado =  (monto1 * 15)/100;
             }else
                  System.out.print("ingresa un numero del 1 al 4, ");

return resultado;
}
    }