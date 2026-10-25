package ui;

import java.util.Scanner;
import model.CategoryType;

public class ProductTypeMenu {

    public static int select(Scanner sc, CategoryType category) {

        if (category == CategoryType.CLOTHING) {
            System.out.println("1. Shirt");
            System.out.println("2. Pants");
            System.out.println("3. Shoes");
            System.out.println("4. Socks");
        } else if (category == CategoryType.ELECTRONICS) {
            System.out.println("1. Phone");
            System.out.println("2. Laptop");
            System.out.println("3. Tablet");
            System.out.println("4. Smartwatch");
        } else {
            System.out.println("1. Sofa");
            System.out.println("2. Table");
            System.out.println("3. Closet");
            System.out.println("4. Chair");
        }

        System.out.println("5. Back");

        int choice = MenuUtil.getChoice(sc, 1, 5);

        if (choice == 5) return -1;

        return choice;
    }
}

