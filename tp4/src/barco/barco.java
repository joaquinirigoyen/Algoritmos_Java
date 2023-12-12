/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barco;

/**
 *
 * @author user
 */
public class barco {
     private int año;
    private String pais_origen;
   
 //constructor
public barco (int año, String pais_origen){
    this.año = año;
    this.pais_origen = pais_origen;

}
//observadores o getter
public int getaño(){
    return año;
}
public String getpais_origen(){
    return pais_origen;
}
public void setaño(int año){
    this.año = año;
}
public void setpais_origen(String pais_origen){
    this.pais_origen = pais_origen;
}

//propio del tipo
public void navegar(){
    System.out.println("navegando");
}
//metodo toString
public String toString() {
return "barco{" + ",año=" + año + ",pais de origen=" + pais_origen +'}' ;
}
    
}
