package io.javabrains;

import java.util.Arrays;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; //--> a "frozen" value (final)
        //a closure is a function that can use parameters not defined in
        //the parameter list
        doProcess(a, i -> {
            System.out.println(i + b);
            int c = b + 100;
            System.out.println("c: " + c);
        });
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process{
    void process(int i);
}