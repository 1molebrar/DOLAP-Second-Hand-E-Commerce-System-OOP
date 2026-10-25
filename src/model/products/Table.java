package model.products;

import model.Brand;
import model.HomeItem;
import model.ProductCondition;

public class Table extends HomeItem {

    public Table(Brand brand, ProductCondition condition) {
        super("Table", brand, 7000, condition);
    }
}

