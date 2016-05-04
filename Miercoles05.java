
package miercoles05;
import java.util.Stack;


public class Miercoles05 {

    
    public static void main(String[] args) {
     
        Stack pila = new Stack();
        
        pila.push("Primer Elemento");
        pila.push(7);
        pila.push(5.4);
        pila.push(999999999L);
        pila.push('#');
        pila.push(6.3F);
        
        System.out.println(pila);
        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Cima: " + pila.peek());
        System.out.println("Posición del elemento: " + pila.search(7));
        System.out.println("Posición del elemento: " + pila.search("Hola"));
        //como no tenemos el elemento Hola muestra posición -1
        
        System.out.println("Elemento des-apilado:" + pila.pop());
        //elimina siempre el primer dato de la pila (6.3F)
         System.out.println("Elemento des-apilado:" + pila.pop());
         //elimina o saca el elemento que sigue de la pila (#)
         
         System.out.println("¿Está la pila vacía?: "+ pila.empty());
         //Empty: verifica si la pila esta vacia
    }
    
}
