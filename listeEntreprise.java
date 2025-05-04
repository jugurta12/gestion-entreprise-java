import java.util.ArrayList;

public class listeEntreprise {
    private ArrayList<Client> Clients;
    private int nbClients;

    public listeEntreprise() {
        this.Clients = new ArrayList<>();
        this.nbClients = 0;
    }

    public int getNbClients() {
        return this.nbClients;
    }

    public void ajoutClient(Client client) {
        this.Clients.add(client);
        this.nbClients++;
    }

    public boolean supprimerClient(String nom) {
        for (Client c : this.Clients) {
            if (c.getNom().equalsIgnoreCase(nom)) {
                this.Clients.remove(c);
                this.nbClients--;
                return true;
            }
        }
        return false;
    }

    public void afficherClients() {
        if (this.nbClients == 0) {
            System.out.println("Aucun client(s) dans la liste.");
        }
        for (Client client : this.Clients) {
            System.out.println(client);
        }
    }
}
