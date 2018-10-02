package nl.craftsmen.presentation.chapter01.innerclass;


import lombok.extern.slf4j.Slf4j;
import nl.craftsmen.presentation.domain.Product;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Product apple = new Product("Apple", 2,50);
        Product banana = new Product("Banana", 1,25);


        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(banana);

        log.info("before: " + products);

        products.sort(new ProductSorter());

        log.info("after : " + products);
    }
}

class ProductSorter implements Comparator<Product> {

    @Override
    public int compare(Product product, Product otherProduct) {
        return product.weight.compareTo(otherProduct.weight);
    }
}
