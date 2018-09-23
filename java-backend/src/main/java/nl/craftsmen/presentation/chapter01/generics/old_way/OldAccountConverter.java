package nl.craftsmen.presentation.chapter01.generics.old_way;

import lombok.extern.slf4j.Slf4j;
import nl.craftsmen.presentation.chapter01.generics.domain.Account;

@Slf4j
public class OldAccountConverter {

    public void process(Integer input) {
        log.info(input.toString());
        final Account domainObject = convert(input);
        log.info(domainObject.toString());
    }

    Account convert(Integer accountNumber) {
        return new Account(accountNumber);
    }
}
