package model.products;

import model.Brand;
import model.Electronics;
import model.ProductCondition;

public class Smartwatch extends Electronics {

    public Smartwatch(Brand brand, ProductCondition condition) {
        super("Smartwatch", brand, 30000, condition);
    }
}

