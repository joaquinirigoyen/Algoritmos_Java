/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej23b;

/**
 *
 * @author user
 */
public class AlgoritmoEj23b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int columna,fila,limite;
        limite = 5;
        for ( fila = 0; fila < 5; fila++) {
            for ( columna = 0; columna < limite; columna++) {
                System.out.print(columna + fila + "  ");
            }
          limite = limite - 1;
        System.out.println(" ");  
        }
        
    }
    
}
