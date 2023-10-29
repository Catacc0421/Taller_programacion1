package com.example;

import java.util.ArrayList;

//Dado un ArrayList de números enteros, encontrar e imprimir el número más grande.
public class EncontrarNumeroMayor {
        public static void main(String[] args) {
        ArrayList<Integer> ListaDeNumeros = new ArrayList<>();
        ListaDeNumeros.add(1000);
        ListaDeNumeros.add(12000);
        ListaDeNumeros.add(50000);
        ListaDeNumeros.add(2002);
        ListaDeNumeros.add(2001);
        
        int numeroMasGrande = ListaDeNumeros.get(0); 

        for (int i = 1; i < ListaDeNumeros.size(); i++) {
            int numeroActual = ListaDeNumeros.get(i);
            if (numeroActual > numeroMasGrande) {
                numeroMasGrande = numeroActual;
            }
        }

        System.out.println("El número más grande es: " + numeroMasGrande);
    }
}
