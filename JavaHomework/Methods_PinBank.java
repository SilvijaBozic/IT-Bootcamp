import java.util.Scanner;

public class Methods_PinBank {
    public static void main(String[] args) {

        //Korisnik unosi pin, moze da unese 3 puta, provera se vrsi u posebnoj metodi

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Unesite pin");
            if (proveraPina(sc.nextInt())) {
                System.out.println("Ispravan pin");
                break;
            } else {
                System.out.println("Neispravan pin. Pokusajte ponovo.");
            }
        }
        System.out.println("Kraj programa");

    }

    public static boolean proveraPina(int x) {
        int pin = 6381;
        if (x==pin) {
            return true;
        } else {
            return false;
        }
    }
}
