package model.products;

import model.Brand;
import model.HomeItem;
import model.ProductCondition;

public class Sofa extends HomeItem {

    public Sofa(Brand brand, ProductCondition condition) {
        super("Sofa", brand, 25000, condition);
    }
}

