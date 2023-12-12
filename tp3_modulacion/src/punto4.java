
import utiles.TecladoIn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class punto4 {
    public static void main(String[] args) {
         double arraypromedio [];
       arraypromedio = new double [5];
       cargar_array(arraypromedio);
       mostrar_array(arraypromedio);
       mayor_prom (arraypromedio);
        
    }
     public static void cargar_array (double [] arrayprom){
        for (int i = 0; i < arrayprom.length; i++) {
            System.out.println("ingrese un numero");
            arrayprom[i] = TecladoIn.readDouble();
             }
        }
       public static void mostrar_array (double [] arrayprom) {
         for (int i = 0; i < arrayprom.length; i++) {
            System.out.print(arrayprom[i] + " ");
           }
           System.out.println(" ");
         }
       public static void mayor_prom (double[] arrayprom) {
          int primer_ingreso = 0;
             double mayor = 0;
             for (int i = 0; i < arrayprom.length; i++) {
                 if ((primer_ingreso == 0) && (arrayprom[i] > mayor)){
                      mayor = arrayprom[i];
                      primer_ingreso = i;
                    }else
                         if (arrayprom[i] > mayor){
                             mayor = arrayprom[i];
                             primer_ingreso = i;
                         }
          
                          }
      
             System.out.println("el mayor promedio introducido es " + mayor);
             System.out.println("la posicion es:" + primer_ingreso);
        
             
    }
    
}
