import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account Manager!");
        System.out.print("Please enter the owner's name: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name);
        System.out.println("Account successfully created for " + account.getOwnerName()
                + " with a starting balance of $" + account.getBalance());

        boolean running = true;

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add money");
            System.out.println("2. Retrieve money");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter the amount to add: $");
                        double addAmount = Double.parseDouble(scanner.nextLine());
                        account.addMoney(addAmount);
                        break;
                    case "2":
                        System.out.print("Enter the amount to retrieve: $");
                        double retrieveAmount = Double.parseDouble(scanner.nextLine());
                        account.retrieveMoney(retrieveAmount);
                        break;
                    case "3":
                        System.out.println("Thank you for using the Bank Account Manager. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please select 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number for the amount.");
            }
        }

        scanner.close();
    }
}
