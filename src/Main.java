import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ShoeStore shoeStore = new ShoeStore();
        menu(shoeStore);
    }
    public static void menu(ShoeStore shoeStore){
        double price = 90;
        String value, password;
        boolean exit = false;
        while (!exit) {
            String choice = lineInput("""
                    How do you wish to pay?
                    1. Credit Card
                    2. Paypal
                    3. Bank Account
                    4. Exit
                    Enter your choice:""");
            switch (choice) {
                case "1":
                    value = lineInput("Enter card number:");
                    password = lineInput("Enter password:");
                    PaymentMethod creditCard = new CreditCard(value, password);
                    shoeStore.purchaseItem(price, creditCard);
                    exit = true;
                    break;
                case "2":
                    value = lineInput("Enter email:");
                    password = lineInput("Enter password:");
                    PaymentMethod paypal = new Paypal(value, password);
                    shoeStore.purchaseItem(price, paypal);
                    exit = true;
                    break;
                case "3":
                    value = lineInput("Enter IBAN:");
                    password = lineInput("Enter password:");
                    PaymentMethod bankAccount = new BankAccount(value, password);
                    shoeStore.purchaseItem(price, bankAccount);
                    exit = true;
                    break;
                case "4":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    static String lineInput(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}