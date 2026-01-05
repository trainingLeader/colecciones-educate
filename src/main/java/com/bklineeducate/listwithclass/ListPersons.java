package com.bklineeducate.listwithclass;

import java.util.LinkedList;
import java.util.Comparator;

public class ListPersons {
    LinkedList<Person> listPersons = new LinkedList<>();

    public ListPersons() {
        listPersons.add(new Person("Carlos", 30));
        listPersons.add(new Person("Ana", 25));
        listPersons.add(new Person("Pedro", 35));
        listPersons.add(new Person("Laura", 22));
        listPersons.add(new Person("Laura Teresa", 20));
        listPersons.add(new Person("María", 28));
    }
    public void viewPersons() {
        for (Person p : listPersons) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }    

    /**
     * Add persons at the beginning and end of the list.
     */
    public void addFirstAndLastPersons() {
        listPersons.addFirst(new Person("Jorge", 40));
        listPersons.addLast(new Person("Elena", 29));
        this.viewPersons();
    }

    /**
     * Show the first and last person in the list.
     */
    public void viewFirstAndLastPerson() {
        Person first = listPersons.getFirst();
        Person last = listPersons.getLast();
        System.out.println("\nPrimera persona: " + first.getName() + " - " + first.getAge());
        System.out.println("Ultima persona: " + last.getName() + " - " + last.getAge());
    }

    /**
     * Replace the person at index 2 and print the updated list.
     */
    public void updateSecondIndexPerson() {
        listPersons.set(2, new Person("Fernando", 33)); // Modifica la persona en indice 2
        System.out.println("\nLista despues de modificar el indice 2:");
        this.viewPersons();
    }

    /**
     * Remove person at index 3 and remove "Jorge" by name, then print the list.
     */
    public void removeByIndexAndName() {
        listPersons.remove(3); // Elimina el indice 3
        listPersons.removeIf(p -> p.getName().equals("Jorge")); // Elimina a Jorge por nombre
        System.out.println("\nLista despues de eliminar a Jorge y la persona en indice 3:");
        this.viewPersons();
    }

    /**
     * Sort the list by name and print the ordered result.
     */
    public void sortByName() {
        listPersons.sort(Comparator.comparing(Person::getName));
        System.out.println("\nLista ordenada por nombre:");
        this.viewPersons();
    }

    /**
     * Sort the list by age and print the ordered result.
     */
    public void sortByAge() {
        listPersons.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("\nLista ordenada por edad:");
        this.viewPersons();
    }

    /**
     * Sort by name and then by age, and print the ordered list.
     */
    public void sortByNameThenAge() {
        Comparator<Person> comparator = Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge);
        listPersons.sort(comparator);
        this.viewPersons();
    }

    /**
     * Sort by age and then by name, and print the ordered list.
     */
    public void sortByAgeThenName() {
        listPersons.sort(
            Comparator.comparingInt(Person::getAge)
                      .thenComparing(Person::getName));
        this.viewPersons();
    }
    
}
