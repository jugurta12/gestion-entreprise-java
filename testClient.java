import java.util.Scanner;

public class testClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter le nom du client:");
        String nom = scanner.nextLine();

        System.out.println("Enter l'âge du client:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter le phone du client:");
        String phone = scanner.nextLine();

        System.out.println("Enter la note du client:");
        double note = scanner.nextDouble();
        note = Client.SaisiePositif(scanner, note);
        scanner.nextLine();

        System.out.println("déja membre?:");
        boolean fidel = scanner.nextBoolean();

        Client Client1 = new Client (nom, age, phone, note, fidel);

        System.out.println(Client1.getInfosClient());
        System.out.println(Client1.getPhoneFrance());
        System.out.println(Client1.getNoteP());
        System.out.println(Client1.getFideleMessage());

    }
}
