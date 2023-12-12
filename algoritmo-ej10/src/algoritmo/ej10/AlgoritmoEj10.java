/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej10;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,edad,siete,diez,trece;
        Scanner leer = new Scanner (System.in);
        siete = 0;
        diez = 0;
        trece = 0;
        for ( i = 1; i < 200; i++) {
            System.out.println("ingrese la edad del nene");
            edad = leer.nextInt();
            switch (edad){
                case 7:
                     siete = siete + 1;
                break;
                case 10:
                    diez = diez+ 1;
                break;
                case 13:
                    trece = trece + 1;
                    break;
                    
                default:
            }
                    }

            System.out.println("la cantidad de nenes de siete es:" + siete);
            System.out.println("la cantidad de nenes de diez es:" + diez);
            System.out.println("la cantidad de nenes de trece es:" + trece);
         
            
    }
    
}
