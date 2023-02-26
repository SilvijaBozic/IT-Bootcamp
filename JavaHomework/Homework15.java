public class Homework15 {
    public static void main(String[] args) {

//      Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

        int niz[] = {10, 15, 74, 51, 43, 87, 29, 60, 44, 55};

        System.out.println("Nove vrednosti niza gde su neparni brojevi uvecani za 2 :");

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 1) {
                niz[i] = niz[i] + 2;
                System.out.println(niz[i]);
            } else {
                System.out.println(niz[i]);
            }
        }
    }
}
