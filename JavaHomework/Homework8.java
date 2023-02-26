import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        //        2. Napraviti program gde unosite svoju godinu rodjenja i
//        ispisati broj prestupnih godina od vaseg rodjenja do tekuce godine.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja :");
        int godina_rodjenja = scanner.nextInt();
        int trenutna_godina = 2022;
        int brojac = 0;

        for (int i = godina_rodjenja; i <= trenutna_godina; i++) {
            if ((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)) {
                brojac=brojac+1;

            }
        }
        System.out.println("Broj prestupnih godina : "+ brojac);
    }
}
