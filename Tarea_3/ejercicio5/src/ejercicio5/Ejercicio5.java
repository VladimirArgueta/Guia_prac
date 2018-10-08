/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Vladimir Argueta
 *///AM16079
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
///5. Una compañía dedicada al alquiler de automóviles cobra $30.00 hasta un máximo de 300 Km
//de distancia recorrida. Para más de 300 y hasta 1000 Km cobra $30.00 más un monto
//adicional de $0.15 por cada Kilómetro en exceso sobre 300. Para más de 1000 Km cobra $30
//más un monto de $0.10 por cada Kilómetro en exceso de 1000. Diseñe un programa que
//calcule el monto a pagar por cada automóvil cobrado en un día de trabajo. 
        double Recorrido;
        double Pago=0;
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese los kilometros que recorrio con el vehiculo: ");
        Recorrido= Leer.nextDouble();
        
        if(Recorrido > 0 && Recorrido <=300){
            Pago+=30;
            
        }else if(Recorrido>300 && Recorrido <=1000){
            Pago= Recorrido-300*0.15+30;
        }else if(Recorrido > 1000){
            Pago= Recorrido-1000*0.10+30;
        }
        
      
    
        System.out.println("El monto  a pagar es: "+ Pago);
        System.out.println("El Recorrido en:"+Recorrido+"Kilometros");
    }
    
}
