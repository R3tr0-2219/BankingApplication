import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static double amount;

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println();
            System.out.println("\n--------Banking System--------");

            System.out.println("Choose option from following - ");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);

                case 2 -> balance += deposit();

                case 3 -> balance -= withdraw(balance);

                case 4 -> isRunning = false;

                default -> System.out.println("Invalid Choice!");

            }
        }

        System.out.println("Thank You!");
        sc.close();
    }

    static void showBalance(double balance){
        System.out.println("Balance : " + balance);
    }

    static double deposit(){

        System.out.print("Enter amount to deposit : ");
        amount = sc.nextDouble();

        if (amount < 0){
            System.out.println("Amount cannot be negative!");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw(double balance){

        System.out.print("Enter amount to withdraw : ");
        amount = sc.nextDouble();

        if (amount < 0){
            System.out.println("Amount cannot be negative!");
            return 0;
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return 0;
        }
        else {
            return amount;
        }
    }
}