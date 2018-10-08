/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Vladimir Argueta
 *///AM16079
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2 Escriba un algoritmo que obtenga la suma e imprima además los términos de la siguiente
//serie:
//2, 5, 7, 10, 12, 15, 17, ..., 1800 

        int numsuma=0;//inicializacion de variables 
        int fin=1800;
        int inicio=1;
        int temp;
        
        System.out.println(numsuma);
        System.out.println(inicio);
    
    while(numsuma+inicio<=fin){
        temp=numsuma;
        
        numsuma=inicio;
        
        inicio=temp + numsuma;
        
        
        System.out.println(inicio);
        
        
    }
    }
}
    
