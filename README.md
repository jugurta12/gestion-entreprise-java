<h1 align="center">gestion-entreprise-java</h1>


Ce projet est une application Java pour la gestion des informations d'un client dans une petite entreprise. Le programme permet de saisir, manipuler et afficher les informations de chaque client. Les fonctionnalités incluent l'ajout, la suppression et l'affichage des clients, avec des opérations sur leurs données comme le calcul d'un indice de satisfaction.

## Structure du Projet

### Le projet est divisé en plusieurs parties, comme suit :

#### Partie 1 : Saisie et Manipulation des Informations d'un Client
Classe GestionClient : Permet de recueillir et manipuler les informations d'un client (nom, âge, téléphone, note de satisfaction, et statut de fidélité).
##### Opérations réalisées :
-Concaténation du nom et de l'âge du client.

-Conversion du numéro de téléphone en format international (+33).

-Calcul de l'indice de satisfaction pondéré (note de satisfaction multipliée par l'âge).

-Message personnalisé en fonction du statut de fidélité.

#### Partie 2 : Séparation en Classes Client et TestClient
Classe Client : Contient les informations d'un client, avec des méthodes pour calculer l'indice de satisfaction et générer un message de fidélité.

Classe TestClient : Sert à tester le fonctionnement des objets Client.

#### Partie 3 : Gestion Dynamique des Clients avec un Tableau
Classe TableauEntreprise : Utilise un tableau fixe pour stocker les clients. Les méthodes incluent l'ajout, la suppression, et l'affichage des clients dans le tableau.

#### Partie 4 : Gestion Dynamique des Clients avec une ArrayList
Classe ListeEntreprise : Utilise une ArrayList pour gérer dynamiquement le nombre de clients. Les opérations restent les mêmes : ajout, suppression et affichage des clients.

#### Partie 5 (final) : la Classe test TestEntreprise
Tester le fonctionnement des classes TableauEntreprise et ListeEntreprise.

## Fonctionnalités finales du programme

#### - Ajout de clients avec saisie interactive
#### - Suppression de clients par nom
#### - Affichage de la liste actuelle des clients
#### - hoix entre une structure fixe (tableau) ou dynamique (ArrayList)
#### - Calcul automatique de l’indice de satisfaction
#### - Messages adaptés à la fidélité du client
