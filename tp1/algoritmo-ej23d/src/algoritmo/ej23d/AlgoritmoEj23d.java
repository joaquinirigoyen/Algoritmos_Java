/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej23d;

/**
 *
 * @author user
 */
public class AlgoritmoEj23d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int columna,fila,limite;
        limite = 6;
        for ( fila = 1; fila < 6; fila++) {
            for ( columna = 1; columna < limite; columna++) {
                System.out.print( columna + " ");
            }
            limite = limite - 1;
            System.out.println(" ");
        }
    }
    
}
