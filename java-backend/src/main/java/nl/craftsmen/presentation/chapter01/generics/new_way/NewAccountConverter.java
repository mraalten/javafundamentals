package nl.craftsmen.presentation.chapter01.generics.new_way;

import nl.craftsmen.presentation.domain.Account;

public class NewAccountConverter extends AbstractConverter<Integer, Account> {

    @Override
    Account convert(Integer accountNumber) {
        return new Account(accountNumber);
    }
}
