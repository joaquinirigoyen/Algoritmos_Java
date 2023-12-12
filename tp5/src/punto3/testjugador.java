/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import utiles.TecladoIn;

/**
 *
 * @author user
 */
public class testjugador {
    public static void main(String[] args) {
        
        boolean continuar;
        
        jugador [] jugadores = new jugador [10];
    
        
        do {
         continuar = ejecutarmenu (seleccionmenu(), jugadores);
        }while(continuar=true);
        
    }
    public static void ingresoJugadores(jugador[]jugadores){
        
        for (int i=0;i< jugadores.length;i++){
            System.out.println("Ingrese el nickname del jugador:"+(i+1));
            String nickName = TecladoIn.readLine();
            jugadores [i] = new jugador (nickName);
        }
    }
    public static void IngresoPuntajes (jugador[] jugadores,String nickName){

        for (int i=0;i< jugadores.length;i++){
            if (jugadores[i].getnickname().equals(nickName)) {
                System.out.println("Ingrese el puntaje que quiere agregar al jugador");
                int puntos = TecladoIn.readInt();
                jugadores[i].setpuntos(puntos); 
                System.out.println("Sigue");
            }    
        }
    }
    public static void puntajAlto(int posicion, jugador[] jugadores){
        int mayor = jugadores[posicion].getpuntos()[0];
        for(int i =0;i <jugadores[posicion].getpuntos().length;i++){
            if (jugadores[posicion].getpuntos()[i]>mayor){
                mayor=jugadores[posicion].getpuntos()[i];
            }
        }
        System.out.println("El puntaje mas alto del jugador:"+jugadores[posicion].getnickname()+" es :"+mayor);

    }
 
    public static void cambioName(String nickName, jugador [] jugadores, String nuevoName){
        for (int i=0;i< jugadores.length;i++){
            if (jugadores[i].getnickname().equalsIgnoreCase(nickName)) {
                System.out.print("El jugador: "+ jugadores[i].getnickname()+" se cambiara a ");
                jugadores[i].setnickname(nuevoName);
                System.out.print(jugadores[i].getnickname());
                System.out.println();
            }    
        }
    }
    public static void ranking (jugador [] jugadores){
        System.out.println("Rankig:");
        for (int i =0; i< jugadores.length;i++){
            puntajAlto(i, jugadores);
        }
    }
    // {}
    public static int seleccionmenu (){
        
        
        int seleccion;

        System.out.println("1_ Cargar Jugadores");
        System.out.println("2_ Ingresar el puntaje de un jugador");
        System.out.println("3_ Consultar puntaje");
        System.out.println("4_Mostrar ranking");
        System.out.println("5_Cambiar NickName de un jugador");
        System.out.println("6_Salir del menu");
        seleccion = TecladoIn.readInt();
        return seleccion;
    }

    public static boolean ejecutarmenu (int seleccion, jugador [] jugadores){
    
        boolean continuar = true;
        switch(seleccion){
            case 1:
                ingresoJugadores(jugadores);
                continuar=true;
            break;
            case 2:
                System.out.println("Ingrese el NickName del jugador que desee ingresar su puntaje");
                String nickName = TecladoIn.readLineWord();
                IngresoPuntajes(jugadores,nickName);
                continuar=true;
            break;
            case 3:
                System.out.println("Ingrese la posicion(1-10) del juador que desee ver su puntaje mas alto");
                int posi = TecladoIn.readInt();
                posi=posi-1;
                puntajAlto(posi, jugadores);
                continuar=true;
            break;
            case 4:
                ranking(jugadores);
                continuar=true;
            break;
            case 5:
                System.out.println("Ingrese el NickName del jugador que se le sera cambiado el nombre");
                String Name = TecladoIn.readLine();  
                System.out.println("Ingrese el nuevo NickName del jugador");
                String nuevoNick = TecladoIn.readLineWord();  
                cambioName(Name, jugadores, nuevoNick);              
                continuar= true;
            break;
            case 6:
                continuar= false;
            break;
            default:
                System.out.println("Selecion no permitida");
            break;
            
        }
        return continuar;
    }
}

