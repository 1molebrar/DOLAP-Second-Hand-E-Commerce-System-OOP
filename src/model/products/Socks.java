package model.products;

import model.Brand;
import model.ProductCondition;
import model.products.Clothing;

public class Socks extends Clothing {

    public Socks(Brand brand, ProductCondition condition) {
        super("Socks", brand, 200, condition);
    }
}

