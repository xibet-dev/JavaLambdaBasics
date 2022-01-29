package io.javabrains;

import java.util.*;

public class Unit1ExerciseJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Dickens", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );

        //Step 1: Sort list by lastName
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printAll(people);

        //Step 3: Create a methods that prints all people that have last name beginning with C
        System.out.println("\nPrinting all persons with last name beginning with C");
        printLastConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });

        System.out.println("\nPrinting all persons with first name beginning with C");
        printLastConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getFirstName().startsWith("C");
            }
        });
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printLastConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}

interface Condition {
    boolean test(Person person);
}