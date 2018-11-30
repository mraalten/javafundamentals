package nl.craftsmen.javafundamentals.backend;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        Client client = new Client();
        client.setCountry(Country.GERMANY);
        System.out.println(client.getCountry().getCode());

    }
}
