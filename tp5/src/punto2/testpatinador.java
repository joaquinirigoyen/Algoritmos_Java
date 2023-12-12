/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class testpatinador {
   public static void main(String[] args) {
        boolean continuar;
        int cant_patinadores;
        System.out.println("Ingrese la cantidad de patinadores");
        cant_patinadores = TecladoIn.readInt();
        Patinador[] patinadores = new Patinador[cant_patinadores];
        do {
            continuar=ejecutarSeleccion(mostrarMenu(), patinadores);
        } while (continuar);
    }
    public static boolean ejecutarSeleccion(int seleccion, Patinador[] array){
        boolean continuar;
        switch(seleccion){
            case 1:
                cargarPatinadores(array);
                continuar= true;
                break;
            case 2:
                char cat;
                do{                        
                    System.out.println("Ingrese la categoria que desea mostrar");
                    cat = TecladoIn.readLineNonwhiteChar();
                    cat = Character.toUpperCase(cat);
                    } while ((cat=='P')&&(cat=='I')&&(cat=='C')&&(cat=='B')&&(cat=='A'));
                mostrarPatinadoresSegunCategoria(array, cat);
                continuar=true;
                break;
            case 3:
                System.out.println("Ingrese el documento del patinador que desea cambiar");
                int doc=TecladoIn.readLineInt();
                for (int i = 0; i < array.length; i++) {
                    if (array[i].getDoc()== doc) {
                        char categ =array[i].getCategoria();
                        array[i].asciendeCategoria(categ);
                        
                    }
                }
                continuar=true;
                break;
            case 4: 
                continuar=false;
                break;
            default:
                System.out.println("La opcion ingresada no es correcta");
                continuar=true;
                break;
        } 
        return continuar;
    }
    public static int mostrarMenu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("1_cargar los datos de los patinadores");
        System.out.println("2_mostrar los datos de los patinadores de una categoria dada");
        System.out.println("3_dado el documento del patinador cambiar su categoria");
        System.out.println("4_salir");
        System.out.println("-------------------------------------------------------");
        int seleccion = TecladoIn.readInt();
        return seleccion;
    }
    public static void cargarPatinadores(Patinador[] patinadores){
        for (int i = 0; i < patinadores.length; i++) {
            patinadores[i]=cargarPatinador();
            System.out.println("Cargo al patinador "+(i+1));
            System.out.println("");
        }
    }
    public static Patinador cargarPatinador(){
        System.out.println("Ingrese el Apellido");
        String apell=TecladoIn.readLine();
        System.out.println("Ingrese el Nombre");
        String nomb=TecladoIn.readLine();
        System.out.println("Ingrese el documento");
        int docu= TecladoIn.readInt();
        System.out.println("Ingrese la edad");
        int edad=TecladoIn.readInt();
        System.out.println("Ingrese la categoria(P,I,C,B,A)");
        char cate=TecladoIn.readChar();
        Patinador pat = new Patinador (apell, nomb, docu,edad, cate);
        return pat; 
    }
    public static void mostrarPatinadoresSegunCategoria(Patinador[] patinadores, char cat) {
        System.out.println("APELLIDO" + "\t" + "NOMBRE"+ "\t"+"\t" + "DOCUMENTO" + "\t" + "EDAD"+ "\t" + "CATEGORIA");
        for (int i = 0; i < patinadores.length; i++) {
            if (patinadores [i].getCategoria()==cat) {
                System.out.println(patinadores[i].toString());
            }
        }
    }
}
