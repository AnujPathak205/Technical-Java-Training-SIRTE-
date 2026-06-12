package Polymorphism;

public class Manager extends Employee {
    private double commision;

    public Manager(double salary,double commission) {
        super(salary);
        this.commision = commission;
    }

    public double getSalary(){
        return super.getSalary()+commision;
    }
}