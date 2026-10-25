package payment;

import java.util.ArrayList;
import java.util.List;
import model.Product;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }
}

