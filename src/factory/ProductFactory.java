package factory;

import model.Brand;
import model.CategoryType;
import model.Product;
import model.ProductCondition;
import model.products.Chair;
import model.Closet;
import model.products.Laptop;
import model.products.Pants;
import model.products.Phone;
import model.products.Shirt;
import model.products.Shoes;
import model.products.Smartwatch;
import model.products.Socks;
import model.products.Sofa;
import model.products.Table;
import model.products.Tablet;

public class ProductFactory {

    public static Product create(CategoryType category, int type, Brand brand, ProductCondition condition) {

        return switch (category) {
            case CLOTHING -> switch (type) {
                case 1 -> new Shirt(brand, condition);
                case 2 -> new Pants(brand, condition);
                case 3 -> new Shoes(brand, condition);
                case 4 -> new Socks(brand, condition);
                default -> null;
            };
            case ELECTRONICS -> switch (type) {
                case 1 -> new Phone(brand, condition);
                case 2 -> new Laptop(brand, condition);
                case 3 -> new Tablet(brand, condition);
                case 4 -> new Smartwatch(brand, condition);
                default -> null;
            };
            case HOME_ITEM -> switch (type) {
                case 1 -> new Sofa(brand, condition);
                case 2 -> new Table(brand, condition);
                case 3 -> new Chair(brand, condition);
                case 4 -> new Closet(brand, condition);
                default -> null;
            };
        };
    }
}

