/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospila;

import java.util.Stack;

/**
 *
 * @author Natalia Amaya
 */
public class MetodosPilas {
    
    
    public void ejercicio1(){
        
       Stack pila = new Stack();
        
        pila.push("A lot like love");
        pila.push("Nada es lo que parece");
        pila.push("Como si tuviera 30");
        pila.push("Face off");
        pila.push("La chica Danesa");
                
        System.out.println(pila);
        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Primera Pelicula Ingresada: " + pila.peek());
        System.out.println("Posición pelicula Face off: " + pila.search("Face off"));
        System.out.println("Posición pelicula The Avengers: " + pila.search("The Avenger"));
        System.out.println("Elemento des-apilado: " + pila.pop());
        System.out.println("¿Está la pila vacía?: "+ pila.empty());
    
}
    public void ejercicio2(){
        
        Stack pila = new Stack();
        
        pila.push(4.5);
        pila.push(6.0);
        pila.push(6.9);
        pila.push(7.0);
        pila.push(5.8);  
        
        for (int i=0; i<pila.size();i++)
            System.out.println(pila.get(i));
        
               
    }
    
    public void ejercicio3(){
        
       Stack pila = new Stack();
        
        pila.push(45);
        pila.push(60);
        pila.push(69);
        pila.push(70);
        pila.push(58);  
        
       for (Object variable: pila){ //FOR EACH
            System.out.println(variable);
        }
    }
    
    public void ejercicio4(){
       
        Stack pila = new Stack();
               
        pila.push("Mujeres que aman demaciado");
        pila.push("Comunicación no Verbal");
       
        while (!pila.empty())
        System.out.println(pila.pop());
          
         }
        
    }
    

