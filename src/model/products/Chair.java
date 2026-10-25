package model.products;

import model.Brand;
import model.HomeItem;
import model.ProductCondition;

public class Chair extends HomeItem {

    public Chair(Brand brand, ProductCondition condition) {
        super("Chair", brand, 1200, condition);
    }
}

