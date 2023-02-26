import java.util.ArrayList;
import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
//        Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0.
//        Zatim cete uneti neki broj, pomocu metode napraviti novu listu koja
//        ce u sebi sadrzati sve brojeve vece od unetog broja. Novu listu
//        pozvati pomocu metode za stampanje elemenata liste.

        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> lista=new ArrayList<>();
        System.out.println("Unesite broj:");
        int broj= scanner.nextInt();
        while (broj != 0) {
            System.out.println("Unesite broj;");
            lista.add(broj);
            broj = scanner.nextInt();
        }

        System.out.println("Prva lista: " + lista);
        System.out.println("Unesite broj za poredjenje:");
        int broj_za_poredjenje= scanner.nextInt();
        System.out.println("Druga lista:");
        stampa(nova_lista(lista, broj_za_poredjenje));

    }
    public static ArrayList<Integer> nova_lista(ArrayList<Integer> a, int x) {
        ArrayList<Integer>lista1=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (x<a.get(i)) {
                lista1.add(a.get(i));
            }
        }
        return lista1;
    }
    public static void stampa(ArrayList<Integer> lista1){
        for (int i = 0; i<lista1.size();i++) {
            System.out.println(lista1.get(i));
        }
    }
}
