package nl.craftsmen.javafundamentals.technical;

import nl.craftsmen.javafundamentals.backend.Client;
import nl.craftsmen.javafundamentals.backend.ClientService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientResource {
    ClientService clientService = new ClientService();

    @RequestMapping("/saveclient")
    public String saveClient(@RequestBody Client client) {

        return clientService.createClient(client);

    }

}
