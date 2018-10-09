package nl.craftsmen.presentation.chapter01.optional;

import nl.craftsmen.presentation.domain.Product;

import java.util.Optional;

public class ProductService {

    private boolean isFound = false;

    public Optional<Product> findProduct(String name) {
        if (name.equals("Y")) {
            return Optional.of(new Product("xyz", 1, 3));
        } else {
            return Optional.empty();
        }

    }
}
