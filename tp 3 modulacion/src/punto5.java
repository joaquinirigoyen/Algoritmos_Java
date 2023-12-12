
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
public class punto5 {
    public static void main(String[] args) {
        char texto[];
        int vocales;
        String oracion;
        System.out.println("ingrese la oracion");
        oracion = TecladoIn.readLine();
        texto = oracion.toCharArray();
        mostrar_array (texto);
        vocales = calcular (texto);
        System.out.println("el total de vocales es " + vocales);
    }
       public static void mostrar_array (char [] texto1) {
         for (int i = 0; i < texto1.length; i++) {
            System.out.print(texto1[i] + " ");
           }
           System.out.println(" ");
         } 
       public static int calcular (char[] texto1) {
           int vocales = 0;
           for (int i = 0; i < texto1.length; i++) {
               if ((texto1[i] == 'a') || (texto1[i] == 'A')){
                  vocales++;
                }
                 else
                    if ((texto1[i] == 'e') || (texto1[i] == 'E')){
                             vocales++;           }

                            else
                              if ((texto1[i] == 'i') || (texto1[i] == 'I')){
                                     vocales++;
                                 }
                               else
                                   if ((texto1[i] == 'o') || (texto1[i] == 'O')){
                                         vocales++;
                                  }else
                                        if ((texto1[i] == 'u') || (texto1[i] == 'U')){
                                             vocales++;
                                            }
           }
               return vocales;
           }
       
}
