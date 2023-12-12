/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author user
 */
public class Patinador {
    private String apellido;
    private String nombre;
    private int dni;
    private int edad;
    private char categoria;
    //contructores
    public Patinador(){
        this.apellido= null;
        this.nombre=null;
        this.dni= 0;
        this.edad= 0;
        this.categoria=('P');    
    }
    public Patinador(String Apellido,String nombre, int dni,int edad, char categoria){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setDoc(dni);
        this.setEdad(edad);
        this.setCategoria(categoria);
        
    }
    //observadores
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getDoc () {
        return this.dni;
    }
    public int getEdad(){
        return this.edad;
    }
    public char getCategoria(){
        return this.categoria;
    }
    public String toString(){
        return this.getApellido()+"\t"+"\t"+this.getNombre()+"\t"+"\t"+this.getDoc()+"\t"+"\t"+this.getEdad()+"\t"+"\t"+this.getCategoria();
    }
    //modificadore
    public void setApellido(String ape){
        this.apellido= ape;
    }
    public void setNombre(String nom){
        this.nombre= nom;
    }
    public void setDoc(int doc){
        this.dni=doc;
    }
    public void setEdad(int ed){
        this.edad=ed;
    }
    public void setCategoria(char cat){
        this.categoria=cat;
    }
    //propios del tipo
    public void asciendeCategoria(char cat){
        switch(cat){
            case'P':this.setCategoria('I');break;
            case'I':this.setCategoria('C');break;
            case'B':this.setCategoria('A');break;
            case'A':System.out.println("No puede subir de categoria");break;
            default:
                System.out.println("Categoria ingresada no valida"); break;
        }      
    }
    public boolean equals(Patinador p){
        boolean true_false;
        if (this.apellido.equalsIgnoreCase(p.getApellido())
                && this.nombre.equalsIgnoreCase(p.getNombre())
                && this.dni== (p.getDoc())
                && this.edad ==(p.getEdad()) 
                && this.categoria == (p.getCategoria()) ){
            true_false= true;
        }else{
            true_false=false;
        }
        return true_false; 
    }    
    
    
    
}

