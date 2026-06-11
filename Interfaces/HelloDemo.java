package Interfaces;

public class HelloDemo {

    public static void main(String[] args) {
        Hello h = () -> "Hello world"; //Lambda expression
        System.out.println(h.sayBye());
        System.out.println(h.sayHello()); //Calling default method
        Hello.greeting(); // Calling static method

        Hello h2 = () -> {
            String msg = "Hello Friends!";
            return msg;
        };

        System.out.println(h2.sayHello());

    }
}
