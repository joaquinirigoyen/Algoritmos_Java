/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej19.el.verdadero;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj19ElVerdadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // m=1 f=2 s=3 c=4 v=5 d=6
        int num_censo,edad,sexo,estado_civil;
        boolean continuar;
        Scanner leer = new Scanner (System.in);
          do {   
              System.out.println("ingrese el numero de censo");
              num_censo = leer.nextInt();
              System.out.println("ingrese sexo masculino o femenino");
              sexo = leer.nextInt();
              System.out.println("ingrese edad");
              edad = leer.nextInt();
              System.out.println("ingrese estado civil: soltero(3),casado(4),viudo(5),divorciado(6) ");
              estado_civil = leer.nextInt();
              if ((sexo == 2) && (estado_civil == 3)&& (edad >= 16) && (edad <= 21)){
                  System.out.println("numero de censo:" + num_censo);
              }else
                  System.out.println("no cumple con los requisitos para el muestreo");
              System.out.println("desea ingresar otra persona?");
              continuar = leer.nextBoolean();
                  
            } while (continuar == true);

    }
    
}
