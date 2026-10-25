package ui;

import java.util.Scanner;
import model.Product;

public class SellerMenu {

    private static double totalEarnings = 0;

    public static void start(Scanner sc) {
        while (true) {
            Product product = ProductMenu.create(sc);
            if (product != null) {
                System.out.println("\nProduct listed and sold!");
                product.printInfo();


                totalEarnings += product.getPrice();

                System.out.println("You earned: " + product.getPrice() + " TL");
                System.out.println("Total earnings so far: " + totalEarnings + " TL");
            }

            System.out.println("\n1. Add another product");
            System.out.println("2. Back to main menu");
            System.out.print("Select: ");

            int choice = MenuUtil.getChoice(sc, 1, 2);

            if (choice == 2) {
                System.out.println("\nReturning to main menu. Total earnings: " + totalEarnings + " TL");
                return;
            }
        }
    }
}

