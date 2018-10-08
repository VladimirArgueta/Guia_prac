/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Vladimir Argueta
 *///AM16079
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //3. Diseñe un algoritmo que dados el peso y la altura de N personas que pertenecen a un
//departamento de la república; obtenga el promedio del peso y de la altura de esta población. 


    String Departamento;
    String Nombre;
    Float peso, altura;
    Float promediop, promedioa;
    int sal, nper=0;
    int tper=0;
    float tpes=0, tal=0;
    Scanner lector= new Scanner(System.in);
    
         System.out.println("digite el nombre del departamento: ");
         Departamento = lector.next();
         
         do{
             System.out.println("ingrese nombre de la persona: ");
         Nombre = lector.next();
         System.out.println("ingrese peso de la persona: libras");
         peso = lector.nextFloat();
         System.out.println("ingrese altura de la persona: centimetros");
         altura = lector.nextFloat();
                         
           tper=tper+1;
           tpes=tpes+peso;
           tal=tal+altura;
             System.out.println("desea agregar otra persona: ");
             System.out.println("1.si");
             
             sal = lector.nextInt();
         }while(sal ==1);
         
         promediop=tpes/tper;
         promedioa=tal/tper;
         System.out.println("el promedio del peso y altura de las personas de "+ Departamento +" es: ");
         System.out.println("peso: " + promediop + " libras");
         System.out.println("altura: " + promedioa + " centimetros");
         
         
     } 
    }
    
