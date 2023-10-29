package com.example;

//Dado un ArrayList de números enteros, eliminar todos los números que sean pares.
import java.util.ArrayList;

public class EliminarPares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(31);
        numeros.add(20);
        numeros.add(12);
        numeros.add(35);
        numeros.add(4);

        ArrayList<Integer> ListaNumeros = new ArrayList<>(numeros);

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                ListaNumeros.remove(Integer.valueOf(numero));
            }
        }

        numeros.clear();
        numeros.addAll(ListaNumeros);

        // Imprimir el ArrayList después de eliminar los números pares
        System.out.println("ArrayList después de eliminar los números pares: " + numeros);
    }
}
