
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
public class punto7 {
    public static void main(String[] args) { 
        int n;
        String palabras [];
        System.out.println("ingrese la cantidad de palabras que va a ingresar");
        n = TecladoIn.readInt();
        palabras = new String [n];
        cargar_array (palabras);
        mostrar_array (palabras);
        
                
    }
     public static void cargar_array (String [] palabra1){
        for (int i = 0; i < palabra1.length; i++) {
            System.out.println("ingrese la palabra en la posicion " + i);
            palabra1[i] = TecladoIn.readLineWord();
             }
        }
       public static void mostrar_array (String [] palabra1) {
         for (int i = 0; i < palabra1.length; i++) {
             char texto [];
             texto  = palabra1[i].toCharArray();
             System.out.println("la palabra en la posicion " +i+ " es: " + palabra1 [i]);
             System.out.println("la cantidad de vocales es:" + calcularv(texto));
           }
         }
          public static int calcularv (char[] texto) {
           int vocales = 0;
           for (int i = 0; i < texto.length; i++) {
               if ((texto[i] == 'a') || (texto[i] == 'A')){
                  vocales++;
                }
                 else
                    if ((texto[i] == 'e') || (texto[i] == 'E')){
                             vocales++;           }

                            else
                              if ((texto[i] == 'i') || (texto[i] == 'I')){
                                     vocales++;
                                 }
                               else
                                   if ((texto[i] == 'o') || (texto[i] == 'O')){
                                         vocales++;
                                  }else
                                        if ((texto[i] == 'u') || (texto[i] == 'U')){
                                             vocales++;
                                            }
           }
               return vocales;
           }
       
}
