/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej20;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AlgoritmoEj20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota_ingles, nota_matematica, nota_programacion,suma_notas_ingles, suma_notas_matematica, suma_notas_programacion, total_alumnos;
        boolean continuar;
        float prom_nota_ingles, prom_nota_matematica, prom_nota_programacion, prom_nota_alumno, prom_general;
         Scanner leer = new Scanner (System.in);
              total_alumnos = 0;
              suma_notas_matematica = 0;
              suma_notas_ingles = 0;
              suma_notas_programacion = 0;
              do {
                  System.out.println("ingrese la nota de ingles");
                  nota_ingles = leer.nextInt();
                  System.out.println("ingrese la nota de programacion");
                  nota_programacion = leer.nextInt();
                  System.out.println("ingrese la nota de matematica");
                  nota_matematica = leer.nextInt();
                  total_alumnos = total_alumnos + 1;
                  suma_notas_ingles = suma_notas_ingles + nota_ingles;
                  suma_notas_matematica = suma_notas_matematica + nota_matematica;
                  suma_notas_programacion = suma_notas_programacion + nota_programacion;
                  prom_nota_alumno = (nota_ingles + nota_programacion + nota_matematica)/3;
                  System.out.println("el promedio de nota de este alumno es de :" + prom_nota_alumno);
                  System.out.println("desea ingresar otra persona?");
                  continuar = leer.nextBoolean();
                                   
              } while (continuar == true);
              prom_nota_ingles = suma_notas_ingles / total_alumnos;
              prom_nota_matematica = suma_notas_matematica / total_alumnos;
              prom_nota_programacion = suma_notas_programacion / total_alumnos;
              prom_general = (suma_notas_ingles + suma_notas_matematica + suma_notas_programacion)/total_alumnos;
              System.out.println("el promedio de notas de ingles es de:" + prom_nota_ingles);
              System.out.println("el promedio de notas de matematica es de:" + prom_nota_matematica);
              System.out.println("el promedio de notas de programacion es de:" + prom_nota_programacion);
              System.out.println("el promedio general es:" + prom_general);
              
              
        
        
       
    }
    
}

    
    

