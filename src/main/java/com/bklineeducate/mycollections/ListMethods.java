package com.bklineeducate.mycollections;

import java.util.ArrayList;
import java.util.List;

/**
 * Operaciones basicas sobre una lista de nombres.
 */
public class ListMethods {
    List<String> nombres = new ArrayList<>();

    /**
     * Inicializa la lista con algunos valores de ejemplo.
     */
    public ListMethods() {
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Laura");
        nombres.add("Maria");
    }

    /**
     * Muestra todos los nombres actuales en la consola.
     */
    public void viewNames() {
        nombres.forEach(elemento -> System.out.println(elemento));
    }

    /**
     * Imprime el nombre almacenado en la posicion indicada.
     *
     * @param indexPos indice basado en cero del elemento que se quiere consultar
     */
    public void getItem(int indexPos) {
        System.out.println("Elemento en indice 2: " + nombres.get(indexPos));
    }

    /**
     * Reemplaza el nombre en la posicion indicada y muestra la lista antes y despues.
     *
     * @param indexModify indice basado en cero del elemento que se quiere modificar
     */
    public void modifyItem(int indexModify) {
        System.out.println("Lista antes de modificar: " + nombres);
        nombres.set(indexModify, "Andrea"); // Reemplaza "Ana" por "Andrea"
        System.out.println("Lista despues de modificar: " + nombres);
    }
}
