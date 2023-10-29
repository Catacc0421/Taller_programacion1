package com.example;

//Cambia el segundo nombre del ArrayList "nombres" por "Ana".
//Elimina el primer nombre del ArrayList "nombres".
//Verifica si el nombre "Carlos" está presente en el ArrayList "nombres".
//Añade el nombre "Pedro" en la segunda posición del ArrayList "nombres".
//Dado un ArrayList de nombres, ordénalos alfabéticamente.
import java.util.ArrayList;
import java.util.Collections;

public class CambiarNombre {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Carolina");
        nombres.add("Iván");
        nombres.add("Catalina");
        nombres.add("Catalina");
        nombres.add("Faber");
        nombres.add(1, "Pedro");

        System.out.println("ArrayList después de agregar a Pedro en la segunda posición: " + nombres);
        
        if (nombres.size() >= 2) {
            nombres.set(3, "Ana"); 
            System.out.println("ArrayList con el nombre Ana: " + nombres);
        } else {
            System.out.println("El ArrayList no tiene al menos dos nombres.");
        }
        if (nombres.size() >= 1) {
        nombres.remove(0); 
        System.out.println("ArrayList después de eliminar el primer nombre: " + nombres);
         }else {
        System.out.println("El ArrayList no tiene nombres para eliminar.");
    }
        String nombreBuscado = "Carlos";
        if (nombres.contains(nombreBuscado)) {
            System.out.println("El nombre " + nombreBuscado + " está presente en la lista de nombres.");
        } else {
            System.out.println("El nombre " + nombreBuscado + " no está presente en la lista de nombres.");
        }
        Collections.sort(nombres);

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}


