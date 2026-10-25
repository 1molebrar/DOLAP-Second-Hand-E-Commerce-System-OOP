package ui;

import java.util.Scanner;
import model.users.Buyer;
import model.users.Seller;
import model.users.User;

public class MainMenu {

    public static void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Select: ");

            int choice = MenuUtil.getChoice(sc, 1, 3);

            if (choice == 1) {
                User user = AuthMenu.login(sc);
                if (user instanceof Buyer) {
                    BuyerMenu.start(sc);
                } else if (user instanceof Seller) {
                    SellerMenu.start(sc);
                }
            } else if (choice == 2) {
                AuthMenu.register(sc);
            } else {
                System.out.println("Thank you for using Dolap. Have a good day:)");
                return;
            }
        }
    }
}

