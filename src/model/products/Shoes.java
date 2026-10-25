package model.products;

import model.Brand;
import model.ProductCondition;
import model.products.Clothing;

public class Shoes extends Clothing {

    public Shoes(Brand brand, ProductCondition condition) {
        super("Shoes", brand, 1500, condition);
    }
}

