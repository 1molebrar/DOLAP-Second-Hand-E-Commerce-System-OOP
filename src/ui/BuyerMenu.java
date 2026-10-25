package ui;

import java.util.Scanner;
import payment.Cart;
import model.Product;

public class BuyerMenu {

    public static void start(Scanner sc) {
        Cart cart = new Cart();

        while (true) {
            Product product = ProductMenu.create(sc);
            if (product != null) {
                cart.addProduct(product);
                product.printInfo();
            }

            System.out.println("\n1. Buy another product");
            System.out.println("2. Go to payment");
            System.out.println("3. Back to main menu");
            System.out.print("Select: ");

            int choice = MenuUtil.getChoice(sc, 1, 3);

            if (choice == 2) {
                if (!cart.isEmpty()) {
                    PaymentMenu.pay(sc, cart);
                } else {
                    System.out.println("Your cart is empty. Please add products before payment.");
                }
                return;
            }

            if (choice == 3) {
                return;
            }
        }
    }
}

