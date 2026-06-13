/*
    Java Notes:

    JDK (Java Development Kit) -> API + 

    JRE (Java Runtime Environment)

    JVM (Java Virtual Machine)

    java.lang -> Default package of java (Math,Integer,Float,Object,String)

    Access Modifiers:
        - default (visible in the same package)
        - public (visible to everywhere)
        - private (visible only in the same class)
        - protected (visible in same package and in child classes of other packages)

    Naming Convention:
        - All small -> package name
        - camel case -> Variable
        - PascalCase -> class
        - all upper -> constant

    one java program can only have one public class and it must be same as file name. 
    these are only considered in package.

    Nested class (Class inside class)

    final (class,method,field)
        - final class -> cannot be inharited 
        - final method -> cannot be override
        - final field -> cannot change value 

    static (class,method,field)
        - One copy accross the class
        - can be accessed by class name (without object)
        - static members belong to class not to object

    Ex: class Comparator.Person has a private member:name , a constructor
        child class Student 

    a class with all static members inharited -> what will happen

    Static members can not be inharited , because it belong to class not object   X
        - who belong to object : can be inharited
        - who belong to class : can not be inharited

    Math class in java is final
    Every wrapper class in java is final : Integer , Float, Character etc.
    String class in java is final => why?

    new Keyword is used for memory allocation. : instantiation

    Object class is parent of all classes in java

    Exception
        - Checked Exception :
        - Unchecked Exception :- is child of Run time Exception handing

    Functional Interface (SAM - Single Abstract Method):
        These are interfaces with only one abstract method.
        - Supplier
        - Consumer
        - Predicate
        - Functional
            -BiSupplier
            -BiConsumer

    Lambdas are designed for functional interfaces
*/

class Alfa{
    public Alfa(){
        System.out.println("Alfa Constructor");
    }

    public void demo(){
        System.out.println("Alfa Demo");
    }
}

class Beta extends Alfa{
    public Beta(){
        System.out.println("Beta constructor");
    }

    public void test(){
        System.out.println("Beta Test");
    }

    @Override
    public void demo(){
        System.out.println("Beta Demo");
    }
}

public class LearningJava{
    public static void main(String[] args) {
        Alfa a = new Alfa();
        a.demo();

        Beta b = new Beta();
        b.test();

        Alfa ab = b; //up casting (Implicit)
        ab.demo();
        // ab.test();   // wrong

        Beta bt = (Beta) ab;// down-casting (Explicit)
        // Beta bt2 = (Beta) a; //wrong

        a = b;
    }
}