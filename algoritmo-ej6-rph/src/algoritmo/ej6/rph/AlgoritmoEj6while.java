/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.ej6.rph;

/**
 *
 * @author user
 */
public class AlgoritmoEj6while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int control;
         control = 0;
          while (control < 100){   
             if ((control % 5==0)){
                 System.out.print(control + " ");
             }
             control = control + 1;
            }
         
    }
    
}
