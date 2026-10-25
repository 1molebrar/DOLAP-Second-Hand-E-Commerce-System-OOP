package model;

public abstract class Product {

    protected String name;
    protected Brand brand;
    protected double basePrice;
    protected double price;
    protected ProductCondition condition;

    protected Product(String name, Brand brand, double basePrice, ProductCondition condition) {
        this.name = name;
        this.brand = brand;
        this.basePrice = basePrice;
        this.condition = condition;
        this.price = condition.apply(basePrice);
    }

    public String getName() { return name; }

    public Brand getBrand() {
        return brand;
    }

    public ProductCondition getCondition() {
        return condition;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getCategory();

    public void printInfo() {
        System.out.println(
                "Product: " + name +
                        "\nCategory: " + getCategory() +
                        "\nBrand: " + brand.getName() +
                        "\nCondition: " + condition +
                        "\nPrice: " + price + " TL"
        );
    }
}

