package com.example;

//Crea un ArrayList de números con los valores 5, 10 y 15.
import java.util.ArrayList;

public class ArraylistNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
      numeros.add(5);
      numeros.add(10);
      numeros.add(15);

      // Imprimir el ArrayList
      System.out.println("ArrayList de números: " + numeros);
  }
}
