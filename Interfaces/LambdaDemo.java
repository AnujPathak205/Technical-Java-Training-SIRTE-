package Interfaces;

import java.util.function.*;

/**
    * Functional Interface (SAM - Single Abstract Method):
        These are interfaces with only one abstract method.
        * Supplier
        * Consumer
            * BiConsumer
        * Predicate
            * BiPredicate
        * Function
            * BiFunction

    * Lambdas are designed for functional interfaces

    * Supplier : it takes nothing return a value
    * Consumer: Takes values but returns nothing
        * Consumer: takes one value
        * BiConsumer: takes 2 values
    * Predicate: It takes a value and returns boolean
        * Predicate: takes one value
        * BiPredicate: takes 2 values
    * Function: takes a value and returns a value
        * Function: takes one value
        * BiFunction: takes 2 values
 */

// This class can be used for any class because we are using Object here (Generic class)
public class LambdaDemo {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        //Consumer
        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Anuj");

        Consumer<String> c1 = System.out::println;
        c1.accept("Aditya");

        Consumer<String> c2 = LambdaDemo::print;
        c2.accept("Amit");

        //Supplier
        Supplier<String> s1 = () -> "Anuj";
        System.out.println(s1.get());
        print(s1.get());

        Supplier<Double> random = Math::random;
        System.out.println(random.get());

        //Predicate
        Predicate<Integer> nonNegative = (x) -> x >= 0;
        System.out.println(nonNegative.test(-11));
        System.out.println(nonNegative.test(22));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));

        BiPredicate<String,String> contains = (str,con) -> str.contains(con);
        System.out.println(contains.test("Mumbai","u"));

        //Function
        Function<Integer,Integer> square = x -> x*x;
        System.out.println(square.apply(4));

        BiFunction<Integer,Integer,Integer> greater = (a,b) -> a>b? a: b;
        System.out.println(greater.apply(12,3));





    }
}
