/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej23a;

/**
 *
 * @author user
 */
public class AlgoritmoEj23a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila,limite,columna;
        limite = 5;
        for ( fila = 1; fila < 5; fila++) {
            for ( columna = 1; columna < limite; columna++) {
                System.out.print("1");
            }
            limite = limite - 1;
            System.out.println(" ");
        }
    }
    
}
