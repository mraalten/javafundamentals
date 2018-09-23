package nl.craftsmen.presentation.chapter01.generics.domain;

public class Account {

    private final Integer accountNumber;

    public Account(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                '}';
    }
}
