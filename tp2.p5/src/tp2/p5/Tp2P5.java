/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.p5;

import static tp2.p5.Tp2P5.indice;
import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class Tp2P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso,altura;
        int edad;
        boolean continuar;
        do {  
            System.out.println("ingresar edad de la persona:");
            edad = TecladoIn.readInt();
            if ((edad >= 20)&&(edad <= 35)){
            System.out.println("ingresar peso de la persona en kgs");
            peso = TecladoIn.readDouble();
            System.out.println("ingresar altura en m");
            altura = TecladoIn.readDouble();
            double resultado = indice (peso,altura);
            System.out.println("el indice de masa corporal es de:" + indice (peso,altura));
             if (24.99 >= resultado){
                System.out.println("no tiene sobrepeso");
             } else{
                    System.out.println("tiene sobre peso");
                    }
            }
         System.out.println("desea ingresar otra persona??");
         continuar = TecladoIn.readLineBoolean();
        } while (continuar == true);
        }
    public static double indice (double peso1,double altura1) {//use este porque hace la cuenta del imc
        double resultado;
        resultado = peso1 / (altura1 * altura1);
        return resultado;
    }
}
