package Taller_programacion1;
// Punto 2 del taller, método is Empty.

import java.util.ArrayList;
import java.util.List;

public class isEmpty {
    public static void main(String[] args) {
        List<String> ListaDePersonas = new ArrayList<>();
        if (ListaDePersonas.isEmpty()){
            System.out.println("La lista de personas está vacía");

        }else {
            System.out.println("La lista no está vacía");
        }

        ListaDePersonas.add("Catalina");
        ListaDePersonas.add("Faber");
        ListaDePersonas.add("Iván");

        if (ListaDePersonas.isEmpty()){
            System.out.println("La lista está vacía");
        }else {
            System.out.println("La lista de personas no está vacía y contiene a las siguientes personas "+ ListaDePersonas);
        }
    }
    
}
