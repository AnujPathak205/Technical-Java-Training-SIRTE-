package Interfaces;

@FunctionalInterface
public interface Hello {
    String sayHello();

    default String sayBye() {
        return "Good bye?";
    }

    static void greeting() {
        System.out.println("Hello everyone!");
    }
}
