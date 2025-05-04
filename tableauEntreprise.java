public class tableauEntreprise {
    private Client [] client;
    private int nbClients;
    private int maxClients;

    public tableauEntreprise(int maxClients) {
    this.client = new Client [maxClients];
    this.nbClients = 0;
    this.maxClients = maxClients;
    }

    public int getNbClients() {
        return this.nbClients;
    }

    public int getMaxClients() {
        return this.maxClients;
    }

    public Client[] getClient() {
        return this.client;
    }

    public void ajoutClient(Client client) {
        if (this.nbClients < this.maxClients) {
            this.client[this.nbClients] = client;
            this.nbClients++;
        }
        else {
            System.out.println("Impossible d'ajouter un client");
        }
    }

    public void supprimerClient(Client client) {
        boolean chercher = false;
        for (int i = 0; i < this.nbClients; i++) {
            if (this.client[i] != null && this.client[i].getNom().equals(client.getNom())){
                for (int j = i; j < this.nbClients - 1; j++) {
                    this.client[j] = this.client[j + 1];
            }
                this.client[this.nbClients - 1] = null;
                this.nbClients--;
                chercher = true;
        }

        }
        if (!chercher) {
            System.out.println("Le client n'existe pas ");
        }
    }

    public void afficherClients() {
        if (this.nbClients == 0) {
            System.out.println("Aucun client dans le tableau.");
        } else {
            System.out.println("Liste des clients :");
            for (int i = 0; i < this.nbClients; i++) {
                // Affichage des informations du client
                System.out.println("Nom: " + this.client[i].getNom() + ", Âge: " + this.client[i].getAge() +
                        ", Téléphone: " + this.client[i].getPhone() + ", Note: " + this.client[i].getNote() +
                        ", Fidèle: " + this.client[i].getFidele());
            }
        }
    }



}