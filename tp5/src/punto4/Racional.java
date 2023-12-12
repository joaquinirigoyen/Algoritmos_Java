/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author user
 */
public class Racional {
    private int numerador;
    private int denominador;
    //constructores
    public Racional (int n, int d){
        this.numerador=n;
        this.denominador=d;
    }
    //observadores
    public int getNumerador(){
        return numerador;
    }
    public int getDenominador(){
        return denominador;
    }
    public double pasarADouble(){
        double res = numerador/denominador;
        return res;
    }
    public String toString(){
        return"Numerador: "+ getNumerador()+"\t"+"\t"+ "Denominador: "+getDenominador();
    }
    public boolean equals(Racional r){
        return this.getDenominador()== r.getDenominador()
                && this.getNumerador() == r.getNumerador();
    }
    ///modificadores
    public void setNumerador(int n){
        this.numerador=n;
    }
    public void setDenominador(int d){
        if (d>0) {
            this.denominador=d;
        } else {
            System.out.println("El numero ingresado no es valido");
        }
    }
    //propias del tipo
    public Racional sumar(Racional r){
       int numeradorResultante=((this.getNumerador()* r.getDenominador())+(r.getNumerador()*this.getDenominador()));
       int denominadorResultante= (this.getDenominador()*r.getDenominador());
       return new Racional(numeradorResultante, denominadorResultante);
    }
    public Racional restar(Racional r){    
       int numeradorResultante=((this.getNumerador()* r.getDenominador())-(r.getNumerador()*this.getDenominador()));
       int denominadorResultante= (this.getDenominador()*r.getDenominador());
       return new Racional(numeradorResultante, denominadorResultante);
    }
    public Racional multiplicar(Racional r){
        int numeradorResultante= (this.getNumerador()*r.getNumerador());
        int denominadorResultante= (this.getDenominador()*r.getDenominador());
        return new Racional(numeradorResultante, denominadorResultante); 
    }
    public Racional dividir(Racional r){
        int numeradorResultante=1,denominadorResultante=1;
        if ((r.getNumerador()/ r.getDenominador())>0) {
             numeradorResultante= (this.getNumerador()*r.getDenominador());
             denominadorResultante= (this.getDenominador()*r.getNumerador());
        }
        return new Racional (numeradorResultante,denominadorResultante);
    }
    public void simplificar(){
        int mod;
        if (this.getNumerador()>this.getDenominador()) {
            mod = maximoComunDivisor(this.getNumerador(),this.getDenominador()
);        } else {
            mod= maximoComunDivisor(this.getDenominador(), this.getNumerador());
        }
        System.out.println("Mod: "+mod);
        if (mod==1) {
            System.out.println("No hay mod, no se puede simplificar la fraccion");
        } else {
            this.numerador=this.getNumerador()/mod;
            this.denominador=this.getDenominador()/mod;
            System.out.println(toString());
        }
        
        
    }
    public int maximoComunDivisor(int mayor, int menor){
        int resultado=0, resto;
        mayor= Math.abs(mayor);
        menor=Math.abs(menor);
        if(menor==0){
            resultado=1;
        }
        while (menor!=0) {            
            resto=mayor % menor;
            resultado=menor;
            menor = resto;
        }
        return resultado;
}
}
