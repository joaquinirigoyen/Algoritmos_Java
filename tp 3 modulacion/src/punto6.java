
import utiles.TecladoIn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class punto6 {
    public static void main(String[] args) {
        int fila,columna;
        int matriz [][];
        matriz = new int [2][3];
        cargar_matriz (matriz);
        mostrar_matriz (matriz);
        pares (matriz);
        mayor (matriz);
    }
    public static void cargar_matriz(int[][] matriz1) {
        for (int fila = 0; fila < matriz1.length; fila++) {
            for (int columna = 0; columna < matriz1[0].length; columna++) {
                System.out.println("ingrese el numero " +fila+ "," +columna+ " de la matriz" );
                matriz1 [fila][columna]  = TecladoIn.readInt();
                
            }
            System.out.println();
        }
        
    }
    public static void mostrar_matriz (int[][] matriz1) {
         for (int fila = 0; fila < matriz1.length; fila++) {
             for (int columna = 0; columna < matriz1[0].length; columna++) {
                System.out.print(matriz1 [fila] [columna] + "\t");
            }
             System.out.println();
       } 
    }
    public static void pares(int[] [] matriz1) {
        int cont_pares = 0;
         for (int fila = 0; fila < matriz1.length; fila++) {
            for (int columna = 0; columna < matriz1[0].length; columna++) {
                if ((matriz1 [fila][columna] % 2)==0){
                    cont_pares ++;
                
            }
                
            }
            }
         System.out.println("la cantidad de pares es de:" + cont_pares);
    }
    public static void mayor(int[][] matriz1) {
        int mayor1 = 0;
         for (int fila = 0; fila < matriz1.length; fila++) {
            for (int columna = 0; columna < matriz1[0].length; columna++) {
                if (matriz1 [fila][columna] > mayor1){
                    mayor1 = matriz1 [fila][columna];
                }
            }
            }
         System.out.println("el mayor numero es: " + mayor1);
    }
}
