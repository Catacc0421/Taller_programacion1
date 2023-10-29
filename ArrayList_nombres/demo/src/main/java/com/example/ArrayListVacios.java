package com.example;

//Crea un ArrayList que contenga tres ArrayLists vacíos.
import java.util.ArrayList;

public class ArrayListVacios {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listaDeListas = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 3; i++) {
            listaDeListas.add(new ArrayList<Integer>());
        }

        // Imprimir la lista de ArrayLists
        System.out.println("ArrayList de ArrayLists vacíos: " + listaDeListas);
    }
}
