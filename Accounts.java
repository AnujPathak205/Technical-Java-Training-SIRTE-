public class Accounts {
    private double balance;

    @Override
    public String toString() {
        return "Accounts{" +
                "balance=" + balance +
                '}';
    }

    public Accounts(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) throws BalanceException{
        if(amount <= balance)
            balance -= amount;
        else
            throw new BalanceException();

        return balance;
    }

    public static void main(String[] args) {
        Accounts a1 = new Accounts(100);
        System.out.println(a1);
//        System.out.println(a1.deposit(50));
//        System.out.println(a1);
        try {
            a1.withdraw(500);
        } catch (BalanceException e) {
            e.printStackTrace();
            System.out.println(e);
        }

        System.out.println("DONE");

    }
}