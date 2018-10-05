package nl.craftsmen.presentation.chapter01.optional;

import nl.craftsmen.presentation.domain.Product;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        final ProductService productService = new ProductService();

        final Optional<Product> optionalProduct = productService.findProduct("Y");
        if (optionalProduct.isPresent()) {
            final Product product = optionalProduct.get();
        }
    }
}
