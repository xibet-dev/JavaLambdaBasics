package io.javabrains;

public class Greeter {

    public void greet() {
        System.out.println("Hello Lambda!");
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
    }
}
