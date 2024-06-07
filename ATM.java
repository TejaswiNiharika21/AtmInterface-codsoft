import java.util.Scanner;

public class ATM {
    private BankAccount a;
    private Scanner sc;

    public ATM(BankAccount a) {
        this.a = a;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Welcome to ATM");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Choose: ");
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Balance: " + a.getBalance());
    }

    private void deposit() {
        System.out.print("Deposit amount: ");
        double amt = sc.nextDouble();
        a.deposit(amt);
    }

    private void withdraw() {
        System.out.print("Withdraw amount: ");
        double amt = sc.nextDouble();
        a.withdraw(amt);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000); 
        ATM atm = new ATM(ba);
        atm.start();
    }
}
