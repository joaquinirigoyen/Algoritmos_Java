/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.p4;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class TpP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int v1,v2;
       boolean continuar;
        do {            
            System.out.println("ingrese la primer variable:");
            v1 = TecladoIn.readInt();
            System.out.println("ingrese la segunda variable:");
            v2 = TecladoIn.readInt();
            intercambio (v1,v2);
             System.out.println("desea ingresar otro par de variables?");
            continuar = TecladoIn.readLineBoolean();
        } while (continuar == true);
        }
    public static void intercambio (int vr1,int vr2) { //use este modulo para que realice el cambio de variable
        int aux = vr1;
        vr1 = vr2;
        vr2 = aux;
        System.out.println("el valor de la 1er variable luego del intercambio es: " + vr1);
        System.out.println("el valor de la 2da variable luego del intercambio es: " + vr2);
            
            
    }
    
}
