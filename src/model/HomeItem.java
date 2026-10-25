package model;

public abstract class HomeItem extends Product {

    protected HomeItem(String name, Brand brand, double basePrice, ProductCondition condition) {
        super(name, brand, basePrice, condition);
    }

    @Override
    public String getCategory() {
        return "HomeItems";
    }
}

