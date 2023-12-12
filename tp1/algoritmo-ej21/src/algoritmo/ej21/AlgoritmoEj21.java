/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej21;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int legajo,nota,suma_nota,mejor_alumno = 0,i;
        float promedio_alumno, mayor_promedio = 0;
        boolean continuar,primer_ingreso;
        Scanner leer = new Scanner (System.in);
          primer_ingreso = true;
          do {      
              System.out.println("ingrese un numero de legajo");
              legajo = leer.nextInt();
              suma_nota = 0;
              for ( i = 1; i < 5; i++) {
                  System.out.println("ingrese nota unidad " + i);
                  nota = leer.nextInt();
                  suma_nota = suma_nota + nota;
                  }
              promedio_alumno = (suma_nota/5);
              System.out.println("promedio alumno:" + promedio_alumno);
              if (primer_ingreso == false){
                  if (promedio_alumno > mayor_promedio){
                      mayor_promedio = promedio_alumno;
                      mejor_alumno = legajo;
                  }else
                      mayor_promedio = promedio_alumno;
                      mejor_alumno = legajo;
                      primer_ingreso = false;
              }
              System.out.println("desea ingresar otra persona?");
              continuar = leer.nextBoolean();
        } while (continuar == true);
          System.out.println("el mayor promedio es:" + mayor_promedio);
          System.out.println("el numero del legajo del alumno con mayor promedio es:" + mejor_alumno);
    }
    
}
