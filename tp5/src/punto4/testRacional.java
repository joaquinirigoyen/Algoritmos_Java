/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class testRacional {
    public static void main(String[] args) {
        boolean continuar;
        do {
           continuar = ejecutarMenu(seleccionMenu());
        } while (continuar == true);
    }
    public static int seleccionMenu(){
        System.out.println("----------------------------------------------------");
        System.out.println("1: Sumar los racionales iniciados");
        System.out.println("2: Restar los racionales iniciadoes");
        System.out.println("3: Multiplicar los racionales iniciados");
        System.out.println("4: Dividir los racionales iniciados");
        System.out.println("5: Simplificar los racionales iniciados");
        System.out.println("6: salir");
        System.out.println("----------------------------------------------------");
        int num = TecladoIn.readInt();
        return num;
    }
    public static boolean ejecutarMenu(int selec){
        boolean continuar;
        Racional ra1,ra2;
        if (selec!=6) {
            System.out.println("********Inicie numeros racionales para poder operar********");
            ra1=iniciarRacionales();
            ra2=iniciarRacionales();
        }else{
            ra1=null;
            ra2=null;
        }
        switch(selec){
            case 1:
                System.out.println("La suma es: "+ra1.sumar(ra2) );
                continuar=true;
                break;
            case 2:
                System.out.println("La resta es: "+ ra1.restar(ra2));
                continuar=true;
                break;
            case 3:
                System.out.println("La Multiplicacion es: "+ra1.multiplicar(ra2));
                continuar=true;
                break;
            case 4:
                System.out.println("La Divisicion es: "+ ra1.dividir(ra2));
                continuar=true;
                break;
            case 5:
                System.out.println("Si desea simplificar el primer racional ingresado pulse 1, si desea simplificar el segundo pulse 2");
                int opc=TecladoIn.readInt();
                if (opc==1) {
                    ra1.simplificar();
                } else if (opc==2) {  
                    ra2.simplificar();
                } else {
                    System.out.println("El numero ingresado no es valido");  
                }
                continuar=true;
                break;
            case 6:
                System.out.println("Saliendo...");
                continuar=false;
                break;
            default: System.out.println("La opcion ingresada no es valida");
            continuar= true;
                break;
        }
        return continuar;
    }
    public static Racional iniciarRacionales(){
            System.out.println("Ingrese el numerador ");
            int numerador=TecladoIn.readInt();
            System.out.println("Ingrese el denominador ");
            int denominador=TecladoIn.readInt();
            Racional racionales1=new Racional(numerador, denominador);
            System.out.println("-------------------------------------------");
            return racionales1;
    }
}
