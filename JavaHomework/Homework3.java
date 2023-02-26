import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//        Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..),
//        zatim izracunavate godine radnog iskustva,
//        ako imate manje od 4 ili 4 godine radnog iskustva,
//        onda ste Junior programer(Napraviti ispis "Ti si Junior programer"),
//        ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer
//        ("Ti si Senior programer"), ako imate vise od 8 godina
//        onda ste direktor firme("Vi ste direktor firme").


        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite godinu kada ste poceli da radite :");
        int godine_pocetka_rada=scanner.nextInt();
        System.out.println("Unesite trenutnu godinu :");
        int trenutna_godina= scanner.nextInt();
        int godine_staza=trenutna_godina-godine_pocetka_rada;

        if(godine_staza<=4){
            System.out.println("Ti si Junior programer.");}
        else if(godine_staza<8){
            System.out.println("Ti si Senior programer.");}
        else{
            System.out.println("Vi ste direktor firme.");
        }
    }
}
