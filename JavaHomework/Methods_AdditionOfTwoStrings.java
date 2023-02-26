public class Methods_AdditionOfTwoStrings {
    public static void main(String[] args) {
        //Sabiranje bilo kojih clanova iz nizova

        System.out.println(niz1(6)+niz2(3));
    }

    public static int niz1(int x) {
        int niz[] = {1,2,3,5,7,6,22,446,88};
        return niz[x];
    }

    public static int niz2(int x) {
        int niz[] = {1,7,6,22,125,878};
        return niz[x];
    }
}
