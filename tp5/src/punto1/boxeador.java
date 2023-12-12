/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

/**
 *
 * @author user
 */
public final class boxeador {
    private String apellido;
    private double estatura;
    private int peso;
    private char categoria;
    //Constructores
    public boxeador() {
        this.setApellido("");
        this.setEstatura(0);
        this.setPeso(0);
    }
    public boxeador(String apellido, double altura, int peso) {
        this.setApellido(apellido);
        this.setEstatura(altura);
        this.setPeso(peso);
    }
    //Observadores
    public String getApellido() {
        return apellido;
    }
    public double getEstatura() {
        return estatura;
    }
    public int getPeso() {
        return peso;
    }
    public char getCategoria() {
        return categoria;
    }
    public String toString() {
        return this.getApellido() + "\t" + "\t" +  this.getEstatura() + "\t" + "\t" + 
                + this.getPeso() + "\t" + this.getCategoria() + "\t" + "\t" + this.obtenerIMC();
    }
    
    //Modificadores
    public void setApellido(String ape) {
        this.apellido = ape;
    }
    public void setEstatura(double alt) {
        this.estatura = alt;
    }
    public void setPeso(int peso) {
        this.peso = peso;
        setCategoria(peso);
    }
    private void setCategoria(int peso) {
        if (peso < 79) {
            this.categoria = 'S';
        } else if ((peso <= 94) && (peso >= 79)) {
            this.categoria = 'C';
        } else {
            this.categoria = 'P';
        }
    }
    //Propias del tipo
    private double obtenerIMC() {
        return (this.getPeso() / (this.getEstatura() * this.getEstatura()));
    }
    public boolean puedeGanarle(boxeador boxea) {
        return this.obtenerIMC() > boxea.obtenerIMC();
    }
    
    
    
    
    
    
}
