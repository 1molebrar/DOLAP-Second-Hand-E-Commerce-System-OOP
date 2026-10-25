package model.products;

import model.Brand;
import model.Product;
import model.ProductCondition;

public abstract class Clothing extends Product {

    protected Clothing(String name, Brand brand, double basePrice, ProductCondition condition) {
        super(name, brand, basePrice, condition);
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }
}

