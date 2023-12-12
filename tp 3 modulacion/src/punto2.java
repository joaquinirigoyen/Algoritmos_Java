

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
public class punto2 {
    public static void main(String[] args) {
       int n, n2;
       int arrayenteros [];
        System.out.println("ingrese un numero para el vector");
        n = TecladoIn.readInt();
        System.out.println("ingrese otro numero");
        n2 = TecladoIn.readInt();
        arrayenteros = new int [n];
        cargar_array(arrayenteros);
       mostrar_array(arrayenteros);
        promedio (arrayenteros); 
        cont_m (arrayenteros, n2);
        System.out.println("el numero ingresado fue: " + n2);
         System.out.println("el promedio es: " + promedio (arrayenteros));
        System.out.println("la cantidad de multiplos es de:" + cont_m (arrayenteros,n2));
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
         public static int promedio(int [] arrayint) {
             int cont = 0, acum=0;
             for (int i = 0; i < arrayint.length; i++) {
                 acum = (acum + arrayint [i]);
                 cont++;
             }
              int prom = (acum /cont );
           return prom;
        
    }
          public static int cont_m (int [] arrayint, int num) {
          int cont1 = 0;
             for (int i = 0; i < arrayint.length; i++) {
                 if (arrayint [i]% num == 0){
                     cont1++;
                 }
                 
             }
           return cont1;
         }
           
}
