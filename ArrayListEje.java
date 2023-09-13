//importamos paquetería para crear los arrayList
import java.util.ArrayList;

public class ArrayListEje {
    public static void main(String[] args) {
    
        /**
         * Permite almacenar datos en memoria
         * similar a los arrays
         * Se realiza de forma dinámica (tamaño variable)
         * 
         */
        //declaramos el ArrayList
        ArrayList<String> nombre = new ArrayList<String>();
        //método para añadir un elemento al final del array
        nombre.add("Juan");
        nombre.add("Alejandra");
        nombre.add("Sergio");
        nombre.add("Daniela");
        nombre.add("Felipe");
        nombre.add("Daniela");
        System.out.println(nombre);
        
        //toma el valor en el indice indicado *.add(index,"String");
        nombre.add(2,"Erick");
        System.out.println(nombre);
        
        int tam = nombre.size();
        System.out.println("No. de elementos: "+tam);
        
        //priemra ocurrencia en java
        int ocurrencia = nombre.indexOf("Daniela");
        System.out.println("1° aparición en la lista: "+ocurrencia);
    }
    
}
