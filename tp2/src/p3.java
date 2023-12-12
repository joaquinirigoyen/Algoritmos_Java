/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.p3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tp2P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,producto;
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero:");
        num = leer.nextInt();
        producto = productoria (num);
    }
    public static int productoria (int num1){ //utilice este porque es igual al punto 2
        int producto1;
        producto1 = 1;
        for (int i = 1; i <= num1; i++) {
            producto1 = producto1 * i;
        }
        System.out.println("el resultado es:" + producto1);
        return producto1;
    }
    
}
