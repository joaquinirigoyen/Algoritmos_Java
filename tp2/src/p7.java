/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.p7;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class Tp2P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1,v2;
        char opcion;
                      
        System.out.println("ingrese el primer numero:");
        v1 = TecladoIn.readInt();
        System.out.println("ingrese el segundo numero:");
        v2 = TecladoIn.readInt();
        System.out.println("ingrese una opcion: (a = suma), (b = resta), (c = multiplicacion), (d = division)");
        opcion = TecladoIn.readChar();
        double res = numero (v1,v2,opcion);
        System.out.println("el resultado de la opcion elegida es:" + res);
        }
    public static double numero(int vr1, int vr2, char opcion1) { //use este modulo para realizar el switch
        double res;
        res = 0;
        switch (opcion1){
            case 'a': res = vr1 + vr2;
                break;
            case 'b':  if (vr1 > vr2){
                               res = vr1 - vr2;
                            } else{
                                res = vr2 - vr1;
                                 }
            break;
            case 'c': res = (vr1 * vr2);
            break;
            case 'd': if (0 != vr2){
                         res = (vr1 / vr2);
                        }else
                            System.out.println("no se puede realizar porque el denominador es 0");
            break;               
            default:
                System.out.println("error al elegir una opcion");
            
        }
        return res;
        
    }
    
}
