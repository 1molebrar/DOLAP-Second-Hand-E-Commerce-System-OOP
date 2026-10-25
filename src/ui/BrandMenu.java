package ui;

import java.util.Scanner;
import model.CategoryType;
import model.Brand;
import repository.BrandRepository;

public class BrandMenu {

    public static Brand select(Scanner sc, CategoryType category) {

        BrandRepository.showBrandsByCategory(category);
        System.out.println((BrandRepository.countByCategory(category) + 1) + ". Back");

        int choice = MenuUtil.getChoice(
                sc,
                1,
                BrandRepository.countByCategory(category) + 1
        );

        if (choice == BrandRepository.countByCategory(category) + 1)
            return null;

        return BrandRepository.getBrandByCategory(category, choice - 1);
    }
}

