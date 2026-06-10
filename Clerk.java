public class Clerk extends Employee {
    private double incentives;

    public Clerk(double salary,double incentives){
        super(salary);
        this.incentives = incentives;
    }

    public double getSalary(){
        return super.getSalary()+incentives;
    }
}
