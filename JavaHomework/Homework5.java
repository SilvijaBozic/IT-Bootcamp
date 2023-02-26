import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {


//        Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina),
//        30cm(Ispise: M Velicina),36cm (ispise: L velicina), 42cm(ispise: XL velicina) u
//        suprotnom izbaciti gresku o nepostojecoj velicini.

        Scanner scaanner=new Scanner(System.in);
        System.out.println("Unesite velicinu :");
        int velicina= scaanner.nextInt();
        switch(velicina) {
            case 24:
                System.out.println("Majica je S velicine.");
                break;
            case 30:
                System.out.println("Majica je M velicine.");
                break;
            case 36:
                System.out.println("Majica je L velicine.");
                break;
            case 42:
                System.out.println("Majica je XL velicine.");
                break;
            default:
                System.out.println("Greska, uneli ste nepostojecu velicinu!");
                break;
        }
    }
}
