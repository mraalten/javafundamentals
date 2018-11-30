package nl.craftsmen.javafundamentals.backend;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class ClientServiceShould {
    ClientService clientService = new ClientService();

    @Test
    public void failWhenFirstNameIsEmpty(){
        Client client = new Client();

        String actual = clientService.createClient(client);

        assertThat(actual, is("firstName missing"));

    }

    @Test
    public void failWhenLastNameIsEmpty(){
        Client client = new Client();
        client.setFirstName("A");

        String actual = clientService.createClient(client);

        assertThat(actual, is("lastName missing"));

    }

    @Test
    public void succeedWhenRequiredFieldArePresent() {
        Client client = new Client();
        client.setFirstName("Hamid");
        client.setLastName("A");

        String message = clientService.createClient(client);
        assertThat(message, is("Geen Fout"));

    }
}

