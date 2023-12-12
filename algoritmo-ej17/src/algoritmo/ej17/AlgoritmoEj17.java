/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej17;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int i,voto,candidato1,candidato2,candidato3;
      Scanner leer = new Scanner (System.in);
         candidato1 = 0;
         candidato2 = 0;
         candidato3 = 0;
         for ( i = 1; i < 250000; i++) {
             System.out.println("ingrese a que candidato voto");
             voto = leer.nextInt();
             switch (voto){
                 case 1:
                        candidato1 = candidato1 + 1;
                     break;
                 case 2:
                        candidato2 = candidato2 + 1;
                     break;
                 case 3:
                        candidato3 = candidato3 + 1;
                     break;
                 default:                       
             }
              }
         System.out.println("votos para el candidato 1:" + candidato1);
         System.out.println("votos para el candidato 2:" + candidato2);
         System.out.println("votos para el candidato 3:" + candidato3);
         if ((candidato2 > candidato1) && (candidato2 > candidato3)){
             System.out.println("candidato 2 es el ganador");
         }else
             if ((candidato1 > candidato2) && (candidato1 > candidato3)){
             System.out.println("candidato 1 es el ganador");
         }else
                 if ((candidato3 > candidato1) && (candidato3 > candidato2)){
             System.out.println("candidato 3 es el ganador");
         } else
                     System.out.println("hay candidatos con la misma cantidad de votantes");
         
    }
    
}
