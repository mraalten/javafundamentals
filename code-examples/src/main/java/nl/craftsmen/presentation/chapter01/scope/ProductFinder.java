package nl.craftsmen.presentation.chapter01.scope;

import lombok.extern.slf4j.Slf4j;
import nl.craftsmen.presentation.domain.Product;

import java.util.List;

@Slf4j
public class ProductFinder {
    private final int price = 10;
    private int counter = 0;
    private int totalPrice = 0;
    private int mostExpensivePrice = 0;

    public int find(List<Product> products) {
        for (Product product : products) {
            if (product.productName != null) {
                int teller = 0;
                counter++;
                int priceForProduct = product.quantity * price;
                totalPrice = totalPrice + priceForProduct;
                log.info("Price for product is: " + priceForProduct);
                if (priceForProduct > mostExpensivePrice) {
                    mostExpensivePrice = priceForProduct;
                }

            }

            log.info("" + mostExpensivePrice);
        }

        log.info("Most expensive price is: " + mostExpensivePrice);
        return totalPrice;
    }

}
