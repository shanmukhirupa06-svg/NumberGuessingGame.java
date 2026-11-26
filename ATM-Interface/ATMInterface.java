import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;
        int choice;

        do {
            System.out.println("\n===== WELCOME TO ATM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your balance is: Rs." + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs.");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully!");
                        System.out.println("New balance: Rs." + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs.");
                    double withdraw = sc.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining balance: Rs." + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
