package nl.craftsmen.presentation.chapter01.generics.domain;

public class Product {

    private final String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
