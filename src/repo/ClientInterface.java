package repo;

import model.client.Client;

public interface ClientInterface {
    public boolean addClient(Client client);

    public boolean deleteClient(Integer clientAFM);


    public Client printClientByAFM(Integer clientAFM);

    public void printAll();
}
