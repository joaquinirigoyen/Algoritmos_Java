/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author user
 */
public class auto {
    //atributos
    private String marca;
    private String color;
    private int año;
 //constructor
public auto (String color, String marca, int año){
    this.marca = marca;
    this.color = color;
    this.año = año;

}
//observadores o getters
public int getaño(){
    return año;
}
public String getcolor(){
    return color;
}
public String getmarca(){
    return marca;
}
public void setmarca(String marca){
    this.marca = marca;
}
public void setcolor(String color){
    this.color = color;
}
public void setaño(int año){
    this.año = año;
}
//propio del tipo
public void andar(){
    System.out.println("andando");
}
//metodo toString
public String toString() {
return "auto{" + "año=" + año + ",marca=" + marca + ",color=" + color +'}' ;
}

}
