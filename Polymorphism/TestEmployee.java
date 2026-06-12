package Polymorphism;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1200);
        System.out.println(e1.getSalary());

        Manager m1 = new Manager(1500,700);
        System.out.println(m1.getSalary());

        Clerk c1 = new Clerk(1300,400);
        System.out.println(c1.getSalary());

        showSalary(m1);
        showSalary(c1);
    }

    private static void showSalary(Employee e){         // polymorphism
        if(e instanceof Manager)
            System.out.println("Polymorphism.Manager salary: "+e.getSalary());
        else
            System.out.println("Polymorphism.Clerk salary: "+e.getSalary());
    }

//    private static void showSalary(Polymorphism.Clerk c1) {
//        System.out.println("Polymorphism.Clerk " + c1.getSalary());
//    }
//
//    private static void showSalary(Polymorphism.Manager m1) {
//        System.out.println("Polymorphism.Manager" + m1.getSalary());
//    }


}
