package io.javabrains;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int key = 0;
        process(numbers, key, wrapperLambda((i, k) -> System.out.println(i / k)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                System.out.println("Executing from wrapper");
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in wapperLambda");
            }
        };
    }
}
 