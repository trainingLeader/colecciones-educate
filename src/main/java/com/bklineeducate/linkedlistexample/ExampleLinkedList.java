package com.bklineeducate.linkedlistexample;

import java.util.LinkedList;

public class ExampleLinkedList {
    LinkedList<String> nombres = new LinkedList<>();

    public ExampleLinkedList() {
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Laura");
        nombres.add("Maria");
    }

    /**
     * Agrega elementos en el inicio y el final de la lista enlazada.
     */
    public void addFirstLast() {
        nombres.addFirst("Inicio"); // Agrega al inicio
        nombres.addLast("Final");   // Agrega al final
        System.out.println("Lista inicial: " + nombres);
    }

    /**
     * Muestra el primer, ultimo y el elemento en indice 2 de la lista.
     */
    public void viewByFirstAndLastAndIndex() {
        System.out.println("Primer elemento: " + nombres.getFirst());
        System.out.println("Ultimo elemento: " + nombres.getLast());
        System.out.println("Elemento en indice 2: " + nombres.get(2));
    }

    /**
     * Replace index 2 with "Fernando" and print the updated list.
     */
    public void updateSecondIndex() {
        nombres.set(2, "Fernando"); // Reemplaza el indice 2 por "Fernando"
        System.out.println("Lista despues de modificar: " + nombres);
    }

    /**
     * Remove first, last and the element at index 2, then print the list.
     */
    public void removeByFirstLastAndIndex() {
        nombres.removeFirst(); // Elimina el primer elemento
        nombres.removeLast();  // Elimina el ultimo elemento
        nombres.remove(2);     // Elimina en indice especifico
        System.out.println("Lista despues de eliminaciones: " + nombres);
    }

    /**
     * Check if "Laura" exists and obtain the index of "Maria".
     */
    public void checkContainsAndIndex() {
        boolean existLaura = nombres.contains("Laura");
        System.out.println("Laura esta en la lista? " + existLaura);
        int positionMaria = nombres.indexOf("Maria");
        System.out.println("Posicion de Maria: " + positionMaria);
    }

}
