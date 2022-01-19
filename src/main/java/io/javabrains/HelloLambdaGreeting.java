package io.javabrains;

public class HelloLambdaGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello Lambda!");
    }
}
