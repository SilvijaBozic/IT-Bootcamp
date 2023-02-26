import java.util.ArrayList;
import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {

//        2. Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste,
//        ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.

        ArrayList<String> lista_imena = new ArrayList<>();
        lista_imena.add("Mila");
        lista_imena.add("Petar");
        lista_imena.add("Ana");
        System.out.println("Lista pre brisanja: " + lista_imena);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ime:");
        String ime = scanner.next();

        boolean brisanje = false;
        while (lista_imena.contains(ime)) {
            lista_imena.remove(ime);
            brisanje = true;
        }

        if (brisanje) {
            System.out.println("Ime " + ime +" je izbrisano.");
        } else {
            System.out.println("Nista nije izbrisano.");
        }

        System.out.println("Lista posle brisanja: " + lista_imena);
    }
}
