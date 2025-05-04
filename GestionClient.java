import java.util.Scanner;

public class GestionClient {

    public static int SaisiePositif(int positif) {
        Scanner sc = new Scanner(System.in);

        while (positif < 0 ) {
            System.out.println("Veuillez entrer votre positif");
            positif = sc.nextInt();
        }

        sc.close();
        return positif;
    }

    public static double getNumber(int age, double note){
        return age * note;
    }

    public static String getphoneF(String phone){
        return "+33 " + phone;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le nom du client: ");
        String nom = sc.nextLine();

        System.out.println("Entrez l'âge du client: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Entrez le numéro de télephone du client: ");
        String phone = sc.nextLine();

        System.out.println("Entrez la note entre 0 et 5: ");
        double note = sc.nextDouble();
        sc.nextLine();

        System.out.println("Fidele: ");
        boolean fidel = sc.nextBoolean();

        System.out.println("Nom: "+ nom + ", âge : " + age);
        System.out.println("num de téléphone :" + getphoneF(nom));
        System.out.println("indice de satisfaction pondéré : " + getNumber(age,note));
        if (fidel == true) {
            System.out.println("Chèr(e) " +nom + ", Merci de votre fidélité ");
        }
        else {
            System.out.println("Chèr(e) "+ nom + "Vous n'êtes pas encore inscrit");
        }

    }
}

