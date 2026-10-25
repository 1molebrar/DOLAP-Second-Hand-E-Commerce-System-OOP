package ui;

import java.util.Scanner;
import payment.Cart;
import payment.CashPayment;
import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.Payment;

public class PaymentMenu {

    public static void pay(Scanner sc, Cart cart) {
        System.out.println("\n1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. Cash");
        System.out.print("Select: ");

        int choice = MenuUtil.getChoice(sc, 1, 3);

        Payment payment;
        if (choice == 1) payment = new CreditCardPayment();
        else if (choice == 2) payment = new DebitCardPayment();
        else payment = new CashPayment();

        payment.pay(cart.getTotalPrice());
        System.out.println("Order completed successfully.");
    }
}

