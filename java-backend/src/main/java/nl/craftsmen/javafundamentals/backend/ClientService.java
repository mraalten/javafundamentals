package nl.craftsmen.javafundamentals.backend;

public class ClientService {

    public String createClient (Client client){
        String errorMessage = validate(client);
        if (errorMessage.equals("Geen Fout")) {
            storeClient(client);
        }
        return errorMessage;
    }

    private String validate(Client client) {
        if (client.getFirstName() == null){
            return "firstName missing";
        }
        if (client.getLastName() == null){
            return "lastName missing";
        }
        return "Geen Fout";
    }


}
