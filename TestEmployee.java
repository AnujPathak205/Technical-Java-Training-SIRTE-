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
            System.out.println("Manager salary: "+e.getSalary());
        else
            System.out.println("Clerk salary: "+e.getSalary());
    }

//    private static void showSalary(Clerk c1) {
//        System.out.println("Clerk " + c1.getSalary());
//    }
//
//    private static void showSalary(Manager m1) {
//        System.out.println("Manager" + m1.getSalary());
//    }


}
