package model.products;

import model.Brand;
import model.Electronics;
import model.ProductCondition;

public class Phone extends Electronics {

    public Phone(Brand brand, ProductCondition condition) {
        super("Phone", brand, 15000, condition);
    }
}

