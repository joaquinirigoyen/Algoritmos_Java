
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
public class punto1 {
    
    public static void main(String[] args) {
    
     int arrayenteros [];
       arrayenteros = new int [5];
       cargar_array(arrayenteros);
       mostrar_array(arrayenteros);
       cont_pares(arrayenteros);
       cont_impares(arrayenteros);
       cont_positivos(arrayenteros);
       cont_negativos(arrayenteros);
       cont_ceros(arrayenteros);
       System.out.println("la cantidad de pares es de: " + cont_pares(arrayenteros));
       System.out.println("la cantidad de impares es de: " + cont_impares(arrayenteros));
       System.out.println("la cantidad de positivos es de: " + cont_positivos (arrayenteros));
        System.out.println("la cantidad de negativos es de: " + cont_negativos (arrayenteros));
         System.out.println("la cantidad de ceros es de: " + cont_ceros (arrayenteros));
        
      }
       public static void cargar_array (int [] arrayint){
        for (int i = 0; i < arrayint.length; i++) {
            System.out.println("ingrese un numero");
            arrayint[i] = TecladoIn.readInt();
             }
        }
       public static void mostrar_array (int [] arrayint) {
         for (int i = 0; i < arrayint.length; i++) {
            System.out.print(arrayint[i] + " ");
           }
         }
       public static int cont_pares(int [] arrayint) {
           int pares = 0;
           for (int i = 0; i < arrayint.length; i++) {
               if ((arrayint [i] % 2)== 0){
                   pares++;
               }
               
           }
        return pares;
       }
         public static int cont_impares(int [] arrayint) {
           int impares = 0;
           for (int i = 0; i < arrayint.length; i++) {
               if ((arrayint [i] % 2)== 1){
                   impares++;
               }
               
           }
        return impares;
    }
    public static int cont_positivos(int [] arrayint) {
        int cont_positivos = 0;
        for (int i = 0; i < arrayint.length; i++) {
            if (arrayint [i] >= 0){
                cont_positivos++;
            }
        }
        return cont_positivos;
    }
    public static int cont_negativos(int [] arrayint) {
        int cont_negativos = 0;
        for (int i = 0; i < arrayint.length; i++) {
            if (arrayint [i] < 0){
                cont_negativos++;
            }
        }
        return cont_negativos;
    }
    public static int cont_ceros(int [] arrayint) {
        int cont_ceros = 0;
        for (int i = 0; i < arrayint.length; i++) {
            if (arrayint [i] == 0){
                cont_ceros++;
            }
        }
        return cont_ceros;
    }
    }
