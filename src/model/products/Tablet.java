package model.products;

import model.Brand;
import model.Electronics;
import model.ProductCondition;

public class Tablet extends Electronics {

    public Tablet(Brand brand, ProductCondition condition) {
        super("Tablet", brand, 12000, condition);
    }
}

