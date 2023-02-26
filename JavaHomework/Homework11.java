import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

//        2. Napraviti program gde cete uneti broj nekih knjiga na lageru,
//        zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
//        tek nakon sto unesete neki drugi string ili ponestaje knjiga na lageru,
//        izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
//        ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki drugi String,
//        onda samo ispisati stanje knjiga na lageru.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj knjiga na stanju:");
        int ukupno_knjige= scanner.nextInt();
        String unos;
        while(true){
            System.out.println("Unesite naziv knjige: ");
            unos= scanner.next();
            if(!unos.equals(".")){
                System.out.println("Stanje knjiga na lageru je: " + ukupno_knjige);
                break;
            }else if(ukupno_knjige==0){
                System.out.println("Nema vise knjiga na lageru.");
                break;
            }else{
                ukupno_knjige--;
                System.out.println(ukupno_knjige);
            }
        }
    }
}
