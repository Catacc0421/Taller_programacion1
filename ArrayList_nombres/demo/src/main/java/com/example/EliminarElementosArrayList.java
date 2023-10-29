package com.example;
//Escribe un programa que elimine todos los elementos de un ArrayList.
import java.util.ArrayList;

public class EliminarElementosArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(8);
        numeros.add(21);
        numeros.add(3);

        System.out.println("ArrayList original: " + numeros);

        numeros.clear();

        System.out.println("ArrayList después de eliminar todos los elementos: " + numeros);
    }
}
