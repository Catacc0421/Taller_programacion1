package com.example;

//Escribe un programa que verifique si un ArrayList está vacío o no.
import java.util.ArrayList;

public class VerificarVacio {
    public static void main(String[] args) {
        ArrayList<String> NewArrayList = new ArrayList<String>();

        // Verificar si el ArrayList está vacío
        if (NewArrayList.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío. Contiene elementos.");
        }
    }
}
