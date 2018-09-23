package nl.craftsmen.presentation.chapter01.generics.new_way;

import nl.craftsmen.presentation.chapter01.generics.domain.Product;

public class NewProductConverter extends AbstractConverter<String, Product> {

    @Override
    Product convert(String productName) {
        return new Product(productName);
    }
}
