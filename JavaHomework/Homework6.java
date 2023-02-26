import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

//        2. Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi)
//        nakon toga, uneti neku godinu izdanja knjige, ukoliko su Triler i Romantika
//        starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru,
//        takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
//        ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite zanr knjige :");
        String zanr = scanner.next();
        System.out.println("Unesite godinu izdanja :");
        int godina_izdanja_knjige = scanner.nextInt();
        int trenutna_godina = 2022;
        int starost_knjige = trenutna_godina - godina_izdanja_knjige;
        switch (zanr) {
            case "Romantika", "Triler":
                if (starost_knjige >= 0 && starost_knjige < 30) {
                    System.out.println("Zanr " + zanr + " je na lageru.");
                } else {
                    System.out.println("Zanr " + zanr + " vise nije na lageru.");
                }
                break;
            case "Horor":
                if (starost_knjige >= 0 && starost_knjige < 40) {
                    System.out.println("Zanr " + zanr + " je na lageru.");
                } else {
                    System.out.println("Zanr " + zanr + " vise nije na lageru.");
                }
                break;
            case "Krimi":
                if (starost_knjige >= 0 && starost_knjige < 20) {
                    System.out.println("Zanr " + zanr + " je na lageru.");
                } else {
                    System.out.println("Zanr " + zanr + " vise nije na lageru.");
                }
                break;
            default:
                System.out.println("Greska, uneli ste pogresan zanr!");
                break;

        }
    }
}
