import java.util.ArrayList;

public class MethodsStringsArrays {
    public static void main(String[] args) {
        int[] niz = {2,5,7,3};
        int[] niz2 = {4,55,67,123,9,0,1};
        ArrayList<Integer> lista = new ArrayList<>();
        stampanje(lista);

        dodavanje(lista, niz[0]);
        dodavanje(lista, niz[niz.length-1]);
        stampanje(lista);

        oduzimanje(lista, 0);
        stampanje(lista);

        dodavanjeNiza(lista, niz);
        stampanje(lista);

        formatiranje(lista);
        stampanje(lista);
        dodavanjeNiza(lista, niz);
        dodavanjeNiza(lista,niz2);
        stampanje(lista);

        formatiranje(lista);
        stampanje(lista);

    }

    public static void dodavanje(ArrayList a, int element) {
        a.add(element);
    }

    public static void dodavanjeNiza(ArrayList a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a.add(b[i]);
        }
    }

    public static void oduzimanje(ArrayList a, int element) {
        a.remove(element);
    }

    public static void formatiranje(ArrayList a) {
        for (int i = a.size()-1; i >= 0; i-- ) {
            a.remove(i);
        }
    }

    public static void stampanje(ArrayList arrayList) {
        for (int i = 0; i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("---------");
    }
}
