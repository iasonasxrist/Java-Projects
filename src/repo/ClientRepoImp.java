package repo;

import model.EnhancedList.EnhancedList;
import model.client.Client;

public class ClientRepoImp implements ClientInterface {

    EnhancedList<Client> clientArrayList = new EnhancedList<>();


    @Override
    public boolean addClient(Client client) {

        clientArrayList.insert(client);
        return true;
    }

    @Override
    public boolean deleteClient(Integer clientAFM) {
        Client toBeDeleted = null;


        for (Client client : clientArrayList) {
            if (client.getClientAFM().equals(clientAFM)) {

                toBeDeleted = client;
                break;
            }
        }
        if (toBeDeleted != null) {
            clientArrayList.remove(toBeDeleted);
            System.out.println("Deleted Successfully!");
            return true;
        }
        return false;
    }

    public Client printClientByAFM(Integer clientAFM) {

        for (Client client : clientArrayList) {
            System.out.println(client.getClientAFM().equals(clientAFM));
            if (client.getClientAFM().equals(clientAFM)) {
                System.out.println(client.toString());
                return client;
            }
        }
        return null;
    }

    public void printAll() {
        for (Client client : clientArrayList) {
            System.out.println(client.toString());
        }
    }
}
