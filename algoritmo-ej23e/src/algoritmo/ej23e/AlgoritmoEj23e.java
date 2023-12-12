/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej23e;

/**
 *
 * @author user
 */
public class AlgoritmoEj23e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int fila,columna,limite;
       limite = 6;
        for ( fila = 0; fila < 5; fila++) {
            for ( columna = 1; columna < limite; columna++) {
                System.out.print( fila + " ");
            }
            limite = limite - 1;
            System.out.println(" ");
        }
    }
    
}
