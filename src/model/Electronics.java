package model;

import model.Brand;
import model.Product;
import model.ProductCondition;

public abstract class Electronics extends Product {

    protected Electronics(String name, Brand brand, double basePrice, ProductCondition condition) {
        super(name, brand, basePrice, condition);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}

