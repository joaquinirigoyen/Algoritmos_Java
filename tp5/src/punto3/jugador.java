/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author user
 */
public class jugador {
    private String  nickname;
    private int puntos [] = new int [10] ;
    //contructores
    public jugador (String nom){
        this.setnickname(nom);
        for (int i = 0; i < puntos.length; i++) {
            puntos [i] = 0;
        }
    }

    //observadores
    public String getnickname(){
        return nickname;
    }
    public int [] getpuntos(){
        return puntos;
    }
    public String toString(){
        return this.getnickname () + "\t" + "\t" + this.getpuntos();
    }
    public boolean equals(jugador j){
        return this.nickname.equalsIgnoreCase(j.getnickname()) 
        && this.puntos == j.getpuntos();
    }
    //modificadores
public void setnickname (String name){
   this.nickname = name;
}
public void setpuntos (int p){
   int menor = puntos [0];
        int posicion = 0;
        for (int i =0; i< puntos.length;i++){
            if (puntos [i]< menor){
                menor = puntos[i];
                posicion = i; 
            }
        }

        if (p > menor){
            puntos[posicion] = p;
        }
    }

    
    
}

