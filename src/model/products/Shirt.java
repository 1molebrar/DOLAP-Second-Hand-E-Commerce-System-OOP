package model.products;

import model.Brand;
import model.ProductCondition;
import model.products.Clothing;

public class Shirt extends Clothing {

    public Shirt(Brand brand, ProductCondition condition) {
        super("Shirt", brand, 600, condition);
    }
}

