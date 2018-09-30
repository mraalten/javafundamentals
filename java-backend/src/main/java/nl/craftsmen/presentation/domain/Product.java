package nl.craftsmen.presentation.domain;

public class Product {

    public final String productName;
    public final int quantity;
    public final Integer weight;

    public Product(String productName, int quantity, Integer weight) {
        this.productName = productName;
        this.quantity = quantity;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return productName + " -> " + weight;
    }

}
