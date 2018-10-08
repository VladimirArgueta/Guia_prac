/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Vladimir Argueta
 * AM16079
 */
public class Ejercicio1 {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      // 1 Diseñe un algoritmo que imprima en orden descendente 3 números leídos. 
        int a, b, c;
        int mayor, menor, medio;
        
        Scanner lector= new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        a = lector.nextInt();
        System.out.println("ingrese el segundo numero: ");
        b = lector.nextInt();
        System.out.println("ingrese un tercer numero: ");
        c = lector.nextInt();
        
        if(a>b && a>c){
            mayor=a;
        }else if(b>a && b>c){
            mayor=b;
        }else{
            mayor=c;
        }
        
        if(a<b && a<c){
            menor=a;
        }else if(b<a && b<c){
            menor=b;
        }else{
            menor=c;
        }
        
        medio=(a + b + c) - (mayor + menor);
        
        System.out.println("ordenados en orden descendentes: ");
        System.out.println(mayor +" "+ medio + " " + menor);
    }
    
}


  