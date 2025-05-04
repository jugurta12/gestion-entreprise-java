import java.util.Scanner;

public class testEntreprise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        tableauEntreprise entrepriseTableau = null;

        System.out.println("(1) Tableau de l'entreprise ou (2) Liste entreprise : ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {
            System.out.println("Entrez la taille du tableau d'entreprise: ");
            int tailleTableau = sc.nextInt();
            sc.nextLine();
            entrepriseTableau = new tableauEntreprise(tailleTableau);

            while (true) {
                System.out.println("(1) Ajouter, (2) Supprimer, (3) Afficher, (0) Quitter");
                int choix = sc.nextInt();
                sc.nextLine();

                if (choix == 0) {
                    System.out.println("Fin du programme.");
                    break;
                }

                if (choix == 1) {
                    System.out.println("Entrez le nom du client: ");
                    String nom = sc.nextLine();

                    System.out.println("Entrez l'âge du client: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Entrez le numéro de téléphone du client: ");
                    String phone = sc.nextLine();

                    System.out.println("Entrez la note entre 0 et 5: ");
                    double note = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Fidèle ? (true/false): ");
                    boolean fidel = sc.nextBoolean();
                    sc.nextLine();

                    Client nouveauClient = new Client(nom, age, phone, note, fidel);
                    entrepriseTableau.ajoutClient(nouveauClient);

                    System.out.println("Le client" + nom + " à été ajouté. Infos : ");
                    System.out.println("Nom: " + nom + ", âge : " + age);
                    System.out.println("Num de téléphone : " + GestionClient.getphoneF(phone));
                    System.out.println("Indice de satisfaction pondéré : " + GestionClient.getNumber(age, note));
                    if (fidel) {
                        System.out.println("Chèr(e) " + nom + ", Merci de votre fidélité ");
                    } else {
                        System.out.println("Chèr(e) " + nom + ", Vous n'êtes pas encore inscrit");
                    }
                } else if (choix == 2) {
                    System.out.println("Entrez le nom du client à supprimer : ");
                    String nomASupprimer = sc.nextLine();

                    Client clientASupprimer = new Client(nomASupprimer, 0, "", 0.0, false);

                    entrepriseTableau.supprimerClient(clientASupprimer);
                    System.out.println(nomASupprimer + " à été supprimer");
                } else if (choix == 3) {
                    System.out.println(entrepriseTableau.getNbClients() + " Client(s) sont présents dans le tableau :");

                    entrepriseTableau.afficherClients();
                } else {
                    System.out.println("Erreur de saisie.");
                }
            }

        } else if (n == 2) {
            System.out.println("La liste a été créée");
            listeEntreprise entrepriseListe = new listeEntreprise();


            while (true) {
                System.out.println("(1) Ajouter, (2) Supprimer, (3) Afficher, (0) Quitter");
                int choix = sc.nextInt();
                sc.nextLine();

                if (choix == 0) {
                    System.out.println("Fin du programme.");
                    break;
                }

                if (choix == 1) {
                    System.out.println("Entrez le nom du client: ");
                    String nom = sc.nextLine();

                    System.out.println("Entrez l'âge du client: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Entrez le numéro de téléphone du client: ");
                    String phone = sc.nextLine();

                    System.out.println("Entrez la note entre 0 et 5: ");
                    double note = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Fidèle ? (true/false): ");
                    boolean fidel = sc.nextBoolean();
                    sc.nextLine();

                    Client nouveauClient = new Client(nom, age, phone, note, fidel);
                    entrepriseListe.ajoutClient(nouveauClient);

                    System.out.println("Le client : " + nom + " à été ajouté(e) ! Infos : ");
                    System.out.println("Nom: " + nom + ", âge : " + age);
                    System.out.println("Num de téléphone : " + GestionClient.getphoneF(phone));
                    System.out.println("Indice de satisfaction pondéré : " + GestionClient.getNumber(age, note));
                    if (fidel) {
                        System.out.println("Chèr(e) " + nom + ", Merci de votre fidélité ");
                    } else {
                        System.out.println("Chèr(e) " + nom + ", Vous n'êtes pas encore inscrit");
                    }
                } else if (choix == 2) {
                    System.out.println("Entrez le nom du client à supprimer : ");
                    String nomASupprimer = sc.nextLine();
                    boolean supprime = entrepriseListe.supprimerClient(nomASupprimer);

                    if (supprime) {
                        System.out.println(nomASupprimer + " a été supprimé.");
                    } else {
                        System.out.println("Client non trouvé.");
                    }

                    entrepriseListe.afficherClients();
                } else if (choix == 3) {
                    System.out.println(entrepriseListe.getNbClients() + " Client(s) sont présents dans le tableau :");
                    entrepriseListe.afficherClients();
                } else {
                    System.out.println("Erreur de saisie.");
                }
            }

        } else {
            System.out.println("Erreur de saisie, fin du programme");
        }

        sc.close();
    }
}
