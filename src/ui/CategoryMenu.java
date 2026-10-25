package ui;

import java.util.Scanner;
import model.CategoryType;

public class CategoryMenu {

    public static CategoryType select(Scanner sc) {
        System.out.println("1. Clothing");
        System.out.println("2. Electronics");
        System.out.println("3. Home Item");
        System.out.println("4. Back");

        int choice = MenuUtil.getChoice(sc, 1, 4);

        if (choice == 4) return null;

        return CategoryType.values()[choice - 1];
    }
}

