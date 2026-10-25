package ui;

import java.util.Scanner;
import model.ProductCondition;

public class ConditionMenu {

    public static ProductCondition select(Scanner sc) {

        System.out.println("1. NEW");
        System.out.println("2. USED");
        System.out.println("3. REFURBISHED");
        System.out.println("4. Back");

        int choice = MenuUtil.getChoice(sc, 1, 4);

        if (choice == 4) return null;

        return ProductCondition.values()[choice - 1];
    }

}

