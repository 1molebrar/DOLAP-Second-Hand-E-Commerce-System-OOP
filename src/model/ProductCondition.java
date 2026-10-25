package model;

public enum ProductCondition {
    NEW(1.0),
    USED(0.7),
    REFURBISHED(0.85);

    private final double multiplier;

    ProductCondition(double multiplier) {
        this.multiplier = multiplier;
    }

    public double apply(double basePrice) {
        return basePrice * multiplier;
    }
}

