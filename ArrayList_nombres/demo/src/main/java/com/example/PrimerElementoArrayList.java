package com.example;

//Muestra el primer elemento de un ArrayList de cadenas.
//Muestra el último elemento de un ArrayList de cadenas.
import java.util.ArrayList;

public class PrimerElementoArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaDeCadenas = new ArrayList<String>();
       listaDeCadenas.add("Mesa");
       listaDeCadenas.add("Silla");
       listaDeCadenas.add("Almohada");
       listaDeCadenas.add("Cama");

       if (!listaDeCadenas.isEmpty()) {
           String primerElemento = listaDeCadenas.get(0);
           System.out.println("El primer elemento es: " + primerElemento);
       } else {
           System.out.println("El ArrayList está vacío.");
       }
       if (!listaDeCadenas.isEmpty()) {
           String primerElemento = listaDeCadenas.get(3);
           System.out.println("El último elemento es: " + primerElemento);
       } else {
           System.out.println("El ArrayList está vacío.");
       }
}

}
