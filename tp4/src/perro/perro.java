/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

/**
 *
 * @author user
 */
public class perro {
    //atributos
    private String raza;
    private String color;
   
 //constructor
public perro (String raza, String color){
    this.raza = raza;
    this.color = color;

}
//observadores o getter
public String getcolor(){
    return color;
}
public String getraza(){
    return raza;
}
public void setraza(String raza){
    this.raza = raza;
}
public void setcolor(String color){
    this.color = color;
}

//propio del tipo
public void ladrar(){
    System.out.println("ladrando");
}
//metodo toString
public String toString() {
return "perro{" + ",raza=" + raza + ",color=" + color +'}' ;
}

}
