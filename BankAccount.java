public class BankAccount {
    private double b;

    public BankAccount(double ib) {
        this.b = ib;
    }

    public double getBalance() {
        return b;
    }

    public void deposit(double a) {
        if (a > 0) {
            b += a;
            System.out.println("Deposited: " + a);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public boolean withdraw(double a) {
        if (a > 0 && a <= b) {
            b -= a;
            System.out.println("Withdrawn: " + a);
            return true;
        } else if (a > b) {
            System.out.println("Insufficient funds.");
            return false;
        } else {
            System.out.println("Invalid amount.");
            return false;
        }
    }
}
