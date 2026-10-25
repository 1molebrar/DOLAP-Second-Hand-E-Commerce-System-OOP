package model.products;

import model.Brand;
import model.ProductCondition;
import model.Electronics;

public class Laptop extends Electronics {

    public Laptop(Brand brand, ProductCondition condition) {
        super("Laptop", brand, 30000, condition);
    }
}

