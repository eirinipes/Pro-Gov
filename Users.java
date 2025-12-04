import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int role;

        do {
            System.out.println("Επιλέξτε ρόλο:");
            System.out.println("1.Πολίτης");
            System.out.println("2.Υπουργός");
            System.out.println("0.Έξοδος");
            role = sc.nextInt();

            switch (role) {
                case 1:
                    citizenMenu(sc);
                    break;
                case 2:
                    ministerMenu(sc);
                    break;
                case 0:
                    System.out.println("Έξοδος από το πρόγραμμα...")΄
                    break;
                default:
                    System.out.println("Λάθος επιλογή");       
    
            }
        } while (role != 0);
    }

    public static void citizenMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("\nΛειτουργίες Πολίτη:");
            System.out.println("1.Προβολή Προϋπολογισμού");
            System.out.println("2.Σύγκριση με Παλαιότερα Δεδομένα");
            System.out.println("0.Έξοδος");

        }
    }
}
