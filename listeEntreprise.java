import java.util.ArrayList;

public class listeEntreprise {
    private ArrayList<Client> Clients;

    public listeEntreprise() {
        this.Clients = new ArrayList<>();
    }

    public void ajoutClient(Client client) {
        this.Clients.add(client);
    }

    public void supprimerClient(Client client) {
        this.Clients.remove(client);
    }

    public void afficherClients() {
        for (Client client : this.Clients) {
            System.out.println(client);
        }
    }
}
