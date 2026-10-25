package ui;

import java.util.Scanner;
import model.CategoryType;
import model.Brand;
import model.Product;
import model.ProductCondition;
import factory.ProductFactory;

public class ProductMenu {

    public static Product create(Scanner sc) {

        while (true) {

            CategoryType category = CategoryMenu.select(sc);
            if (category == null) return null;

            int type = ProductTypeMenu.select(sc, category);
            if (type == -1) continue;

            Brand brand = BrandMenu.select(sc, category);
            if (brand == null) continue;

            ProductCondition condition = ConditionMenu.select(sc);
            if (condition == null) continue;

            return ProductFactory.create(category, type, brand, condition);
        }
    }
}

