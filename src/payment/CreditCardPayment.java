package payment;

import java.util.Scanner;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Credit Card Payment Details ---");
        System.out.println("Total Amount to Pay: " + amount + " TL");

        String bank = getBankName(scanner);

        if (bank.equalsIgnoreCase("Garanti") || bank.equalsIgnoreCase("Ziraat")) {
            System.out.println("Selected Bank: " + bank);
            System.out.print("Please select your payment method (1: One-Time Payment / 2: 2 Installments): ");

            String choice;
            while (true) {
                choice = scanner.nextLine().trim();
                if (choice.equals("1") || choice.equals("2")) {
                    break;
                }
                System.out.print("Invalid choice. Please enter 1 or 2: ");
            }

            if (choice.equals("2")) {
                double finalPrice = amount * 1.10;
                System.out.println("Your payment has been set up in 2 installments with a 10% interest rate.");
                System.out.println("Total with interest: " + finalPrice + " TL (" + (finalPrice / 2) + " TL x 2)");
            } else {
                System.out.println("Your payment of " + amount + " TL has been completed as a one-time payment.");
            }

        } else if (bank.equalsIgnoreCase("Isbank") || bank.equalsIgnoreCase("Akbank")) {
            System.out.println("Selected Bank: " + bank);
            System.out.print("How many installments would you like? (1–6 installments, no interest): ");

            int installmentCount;
            while (true) {
                try {
                    installmentCount = Integer.parseInt(scanner.nextLine().trim());
                    if (installmentCount >= 1 && installmentCount <= 6) {
                        break;
                    } else {
                        System.out.print("Invalid installment count. Please enter a number between 1 and 6: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a number between 1 and 6: ");
                }
            }

            System.out.println("Your payment of " + amount + " TL has been divided into " + installmentCount + " installments at the cash price.");
            System.out.println("Monthly payment: " + (amount / installmentCount) + " TL");
        }

        System.out.println("Credit Card Transaction Successful!\n");
    }

    private String getBankName(Scanner scanner) {
        String[] validBanks = {"Garanti", "Ziraat", "Isbank", "Akbank"};

        while (true) {
            System.out.print("Which bank card would you like to use? (Garanti, Ziraat, Isbank, Akbank): ");
            String input = scanner.nextLine().trim();

            for (String bank : validBanks) {
                if (input.equalsIgnoreCase(bank)) {
                    return bank;
                }
            }

            System.out.println("Invalid bank name. Please choose one of the supported banks.");
        }
    }
}
