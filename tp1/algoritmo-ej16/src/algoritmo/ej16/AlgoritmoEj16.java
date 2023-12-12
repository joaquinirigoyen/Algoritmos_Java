/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej16;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //n=1 s=2 c=3
        int norte,sur,centro,seccion;
        boolean continuar;
        Scanner leer = new Scanner (System.in);
           norte = 0;
           sur = 0;
           centro = 0;
           do {  
             System.out.println("ingrese la seccion: norte,centro o sur");
             seccion = leer.nextInt();
             if ((seccion == 1)){
                 norte = norte + 1;
                    
             }else
                 if ((seccion == 2)){
                     sur = sur + 1;
                 }else
                     if ((seccion == 3)){
                         centro = centro + 1;
                     }else 
                         System.out.println("ingreso una seccion erronea");
               System.out.println("desea ingresar otro votante?");
               continuar = leer.nextBoolean();
                 
        } while (continuar == true);
           System.out.println("votantes del norte:" + norte);
           System.out.println("votantes del sur:" + sur);
           System.out.println("votantes del centro:" + centro);
           if ((norte > sur) && (norte > centro)){
               System.out.println("la seccion con mayor numeros de votantes es la del norte");
           }else
               if ((sur > norte) && (sur > centro)){
               System.out.println("la seccion con mayor numeros de votantes es la del sur");
           }else
                   if ((centro > sur) && (centro > norte)){
               System.out.println("la seccion con mayor numeros de votantes es la del centro");
           }else
                       System.out.println("hay secciones con igual cantidad de votantes");
          
          
    }
    
}
