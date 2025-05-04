import java.util.Scanner;

public class Client {
    private String nom;
    private int age;
    private String phone;
    private double note;
    private boolean fidele;


    public Client(String nom, int age, String phone, double note, boolean fidele) {
        this.nom = nom;
        this.age = age;
        this.phone = phone;
        this.note = note;
        this.fidele = fidele;
    }

    public double getNote() {
        return note;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public boolean getFidele() {
        return fidele;
    }

    public static double SaisiePositif(Scanner sc,double note) {

        while (note < 0 || note > 5) {
            System.out.println("Veuillez entrer votre note entre 0 et 5");
            note = sc.nextDouble();
        }
        return note;
    }

    public double getNoteP(){
        return age * note;
    }

    public String getInfosClient(){
        return "Nom : " + nom + ", Âge : " + age + "ans";
    }

    public String getPhoneFrance(){
        return "+33 " + phone;
    }

    public String getFideleMessage(){
        if (fidele) {
            return "Chèr(e) " +nom + ", Merci de votre fidélité ";
        }
        else {
            return "Chèr(e) "+ nom + ", Vous n'êtes pas encore inscrit";
        }
    }
}


