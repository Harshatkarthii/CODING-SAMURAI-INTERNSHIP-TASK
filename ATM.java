import java.util.*;

class Account {
    private String name;
    private String pass;
    private double amount;

    public Account(String name, String pass, double amount) {
        this.name = name;
        this.pass = pass;
        this.amount = amount;
    }

    public boolean authenticate(String passa) {
        return pass.equals(passa);
    }

    public void Deposit(double depositamount) {
        amount += depositamount;
        System.out.println("Amount Deposited: " + depositamount);
        System.out.println("Bank Balance: " + amount);
    }

    public void Withdraw(double withdrawamount) {
        if (withdrawamount > amount) {
            System.out.println("Insufficient Balance!");
        } else {
            amount -= withdrawamount;
            System.out.println("Amount Withdrawn: " + withdrawamount);
            System.out.println("Bank Balance: " + amount);
        }
    }

    public void CheckBalance() {
        System.out.println("The Balance amount: " + amount);
    }
}

public class ATM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account Holder name: ");
        String name = sc.nextLine();

        System.out.print("Set a PIN for the account: ");
        String pass = sc.nextLine();

        System.out.print("Enter the Initial Deposit amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        Account ac1 = new Account(name, pass, amount);

        System.out.println("\n----- Login -----");
        System.out.print("Enter the PIN: ");
        String passa = sc.nextLine();

        if (!ac1.authenticate(passa)) {
            System.out.println("Login Failed! Incorrect PIN");
            return;
        }

        int choice;
        do {
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Amount to Deposit: ");
                    ac1.Deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter the Amount to Withdraw: ");
                    ac1.Withdraw(sc.nextDouble());
                    break;
                case 3:
                    ac1.CheckBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid Input! Try Again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
