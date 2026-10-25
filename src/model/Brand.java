package model;

import java.util.Set;

public class Brand {

    private final String name;
    private final Set<CategoryType> categories;

    public Brand(String name, Set<CategoryType> categories) {
        this.name = name;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public boolean supports(CategoryType category) {
        return categories.contains(category);
    }
}

