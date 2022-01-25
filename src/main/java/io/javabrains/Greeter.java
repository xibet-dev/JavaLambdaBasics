package io.javabrains;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting myLambdaFunction = () -> System.out.println("Hello Lambda! (myLambdaFunction)");
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello Lambda! (innerClassGreeting)");
            }
        };

        MyAdd addFunction = (int a, int b) -> a + b;

        innerClassGreeting.perform();
        myLambdaFunction.perform();

        greeter.greet(myLambdaFunction);
        greeter.greet(innerClassGreeting);
        greeter.greet(() -> System.out.println("Hello Lambda! (myLambdaFunction)"));
    }
}

interface MyAdd{
    int add(int a, int b);
}

