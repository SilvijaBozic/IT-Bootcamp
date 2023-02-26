import java.util.ArrayList;

public class Homework17 {
    public static void main(String[] args) {


//        Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
//        jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista zadrzati sve neparne brojeve.

        int niz[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> lista_parnih_brojeva = new ArrayList<>();
        ArrayList<Integer> lista_neparnih_brojeva = new ArrayList<>();


        for(int i=0;i<niz.length;i++){
            if(niz[i]%2==0){
                lista_parnih_brojeva.add(niz[i]);
            }
            if(niz[i]%2==1){
                lista_neparnih_brojeva.add(niz[i]);
            }
        }
        System.out.println("Lista parnih brojeva :");
        for (int i = 0; i < lista_parnih_brojeva.size(); i++) {
            System.out.println(lista_parnih_brojeva.get(i));
        }
        System.out.println("Lista neparnih brojeva :");
        for (int i = 0; i < lista_neparnih_brojeva.size(); i++) {
            System.out.println(lista_neparnih_brojeva.get(i));
        }
        System.out.println("Lista parnih brojeva je: " + lista_parnih_brojeva);
        System.out.println("Lista neparnih brojeva je : " + lista_neparnih_brojeva);
    }
}
