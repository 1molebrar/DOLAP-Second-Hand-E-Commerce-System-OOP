package repository;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

import model.Brand;
import model.CategoryType;

public class BrandRepository {

    private static final List<Brand> brands = new ArrayList<>();

    static {
        brands.add(new Brand("NIKE", EnumSet.of(CategoryType.CLOTHING)));
        brands.add(new Brand("ADIDAS", EnumSet.of(CategoryType.CLOTHING)));
        brands.add(new Brand("ZARA", EnumSet.of(CategoryType.CLOTHING)));

        brands.add(new Brand("APPLE", EnumSet.of(CategoryType.ELECTRONICS)));
        brands.add(new Brand("SAMSUNG", EnumSet.of(CategoryType.ELECTRONICS)));
        brands.add(new Brand("NOKIA", EnumSet.of(CategoryType.ELECTRONICS)));

        brands.add(new Brand("IKEA", EnumSet.of(CategoryType.HOME_ITEM)));
        brands.add(new Brand("KARACA", EnumSet.of(CategoryType.HOME_ITEM)));
        brands.add(new Brand("ARCELIK", EnumSet.of(CategoryType.HOME_ITEM)));
    }

    private static List<Brand> getBrandsByCategory(CategoryType category) {
        return brands.stream()
                .filter(brand -> brand.supports(category))
                .collect(Collectors.toList());
    }

    public static void showBrandsByCategory(CategoryType category) {
        List<Brand> categoryBrands = getBrandsByCategory(category);
        int index = 1;
        for (Brand brand : categoryBrands) {
            System.out.println(index + ". " + brand.getName());
            index++;
        }
    }

    public static int countByCategory(CategoryType category) {
        return getBrandsByCategory(category).size();
    }

    public static Brand getBrandByCategory(CategoryType category, int index) {
        List<Brand> categoryBrands = getBrandsByCategory(category);
        if (index >= 0 && index < categoryBrands.size()) {
            return categoryBrands.get(index);
        }
        return null;
    }
}
