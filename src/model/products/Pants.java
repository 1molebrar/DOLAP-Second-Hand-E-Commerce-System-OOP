package model.products;

import model.Brand;
import model.ProductCondition;
import model.products.Clothing;

public class Pants extends Clothing {

    public Pants(Brand brand, ProductCondition condition) {
        super("Pants", brand, 15000, condition);
    }
}

