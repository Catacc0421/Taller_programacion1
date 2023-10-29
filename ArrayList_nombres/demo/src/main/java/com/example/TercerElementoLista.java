package com.example;

//Dado un ArrayList de números, muestra el tercer elemento de la lista.
//Escribe un programa que recorra un ArrayList de números y muestre cada número.
//Duplica todos los elementos de un ArrayList de números enteros.
import java.util.ArrayList;

public class TercerElementoLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        if (numeros.size() >= 3) {
            int tercerElemento = numeros.get(2);
            System.out.println("El tercer elemento es: " + tercerElemento);
        } else {
            System.out.println("El ArrayList no tiene al menos 3 elementos.");
        }
        System.out.println("Números en el ArrayList:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
        for (int i = 0; i < numeros.size(); i++) {
            int elemento = numeros.get(i);
            numeros.set(i, elemento * 2);
        }
            System.out.println("ArrayList con elementos duplicados: " + numeros);
    }
}
