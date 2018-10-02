package nl.craftsmen.presentation.domain;

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
