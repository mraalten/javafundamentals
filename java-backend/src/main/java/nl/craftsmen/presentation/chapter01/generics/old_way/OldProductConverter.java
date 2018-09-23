package nl.craftsmen.presentation.chapter01.generics.old_way;

import lombok.extern.slf4j.Slf4j;
import nl.craftsmen.presentation.chapter01.generics.domain.Product;

@Slf4j
public class OldProductConverter {

    public void process(String input) {
        log.info(input);
        final Product domainObject = convert(input);
        log.info(domainObject.toString());
    }

    Product convert(String productName) {
        return new Product(productName);
    }
}
