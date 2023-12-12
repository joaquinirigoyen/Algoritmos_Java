
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
public class punto3 {
    public static void main(String[] args) {
        int posicion1, posicion2;
        int arrayenteros [];
       arrayenteros = new int [5];
       cargar_array(arrayenteros);
       mostrar_array(arrayenteros);
        do {  
            System.out.println("ingrese la posicion que quiere intercambiar (0-4)");
            posicion1 = TecladoIn.readInt();
        } while ((posicion1 > 4)||(posicion1 < 0) );
        do {            
             System.out.println("ingrese porque otra posicion quiere intercambiar (0-4)");
            posicion2 = TecladoIn.readInt();
        } while ((posicion2 > 4)||(posicion2 < 0) );
        intercambiar (arrayenteros, posicion1, posicion2);
        mostrar_array(arrayenteros); 
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
           System.out.println(" ");
         }
       public static void intercambiar(int[] arrayint, int pos1, int pos2) {
          int aux;
          aux = 0;
            for (int i = 0; i < arrayint.length; i++) {
                   if (i == pos1){
                   aux = arrayint[i];
               } else
                   if (i == pos2){
                       arrayint[pos1] = arrayint[i];
                       arrayint[i] = aux;
                 }
           }
            
            }
       }
           
          
  
