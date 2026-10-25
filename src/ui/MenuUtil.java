package ui;

import java.util.Scanner;

public class MenuUtil {

    public static int getChoice(Scanner sc, int min, int max) {
        while (true) {
            try {
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice >= min && choice <= max) {
                    return choice;
                }
            } catch (Exception e) {
                sc.nextLine();
            }
            System.out.print("Select again: ");
        }
    }

}

