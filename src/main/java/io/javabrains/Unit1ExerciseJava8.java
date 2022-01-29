package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Dan", "Dickens", 50),
                new Person("Lewis", "Dickens", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1: Sort list by lastName
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        //Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        performConditionally(people, person -> true, (p) -> System.out.println(p));

        //Step 3: Create a methods that prints all people that have last name beginning with C
        System.out.println("\nPrinting all persons with last name beginning with C");
        performConditionally(people, (p) ->  p.getLastName().startsWith("C"),
                (p) -> System.out.println(p));

        System.out.println("\nPrinting all persons with first name beginning with C");
        performConditionally(people, (p) -> p.getFirstName().startsWith("C"),
                (p) -> System.out.println(p.getFirstName() ));
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate,
                                             Consumer<Person>  consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}


