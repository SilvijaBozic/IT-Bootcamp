import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

//        Napraviti program gde cete uneti svoju radnu poziciju, mozete uneti "fizikalac",
//        "inzenjer" i "masinovodja" i uneti svoju platu. Ispisati u konzoli poziciju koju radis i platu.
//        Ako ste na poziciji fizikalca, povecati platu za 15%.
//        Ako ste na poziciji inzenjera, povecati platu za 20%.
//        Ako ste na poziciji masinovodje, povecati platu za 30%.
//        Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke. (edited)

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite svoju radnu poziciju :");
        String radna_pozicija= scanner.next();
        System.out.println("Unesite svoju platu :");
        double plata= scanner.nextDouble();

        if(radna_pozicija.equalsIgnoreCase("fizikalac")){
            plata=plata+(plata*0.15);
        }else
        if(radna_pozicija.equalsIgnoreCase("inzenjer")){
            plata=plata+(plata*0.2);
        }else
        if (radna_pozicija.equalsIgnoreCase("masinovodja")){
            plata=plata+(plata*0.3);}
        else{
            System.out.println("Greska, uneli ste pogresnu poziciju!");
            return;
        }
        System.out.println("Plata za poziciju " + radna_pozicija + " iznosi : " + plata);
    }
}
