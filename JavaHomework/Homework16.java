import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {

//        Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj,
//        i u novom nizu smestiti sve brojeve koji su veci od tog unetog broja
//        (Obratiti paznju da nov niz nema prazna polja tj 0).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj:");
        int broj = scanner.nextInt();
        int niz1[] = {1, 10, 72, 55, 61, 3, 21, 7};
        int niz2[] = new int[niz1.length];

        System.out.println("Clanovi novog niza su:");
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] > broj) {
                niz2[i] = niz1[i];
                System.out.println(niz2[i]);
            }
        }
    }
}
