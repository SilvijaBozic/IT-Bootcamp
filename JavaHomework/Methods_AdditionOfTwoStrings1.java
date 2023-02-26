public class Methods_AdditionOfTwoStrings1 {
    public static void main(String[] args) {

        //Sabiranje dva niza razlicitih velicina
        int niz1[] = {1,2,3,4,5};
        int niz2[] = {2,4};

        //Kad budem zavrsio zadatak probacu sa opcijom kada je drugi niz duzi
        //int niz2[] = {2,4,1,1,1,1};

        //Moram da znam koji niz je duzi pre sabiranja kako bih znao koliko puta petlja treba da se izvrsi
        //Ako uzmem recimo da se petlja izvrsi onoliko puta koliko ima clanova manji niz, onda necu sabrati sve
        int veciNiz;
        int manjiNiz;

        if (niz1.length>niz2.length) {
            veciNiz = niz1.length;
            manjiNiz = niz2.length;
        } else {
            veciNiz = niz2.length;
            manjiNiz = niz1.length;
        }

        //Zato sto unapred ne znam koji niz ima vise clanova moram i da napravim novi niz
        //koji ce imati one clanove kao veci niz (ako je prvi niz veci onda ce ovaj novi imati te clanove i obrnuto)
        int niz[] = new int[veciNiz];
        //Dodeljujem clanove veceg niza novom nizu kako bih napravio novi niz do kraja
        //Ovaj novi niz se moze smatrati kao 'pomocni'
        if (niz1.length>niz2.length) {
            for (int i = 0; i < niz.length; i++) {
                niz[i] = niz1[i];
            }
        } else {
            for (int i = 0; i < niz.length; i++) {
                niz[i] = niz2[i];
            }
        }

        //Krecem sabiranje prvog i drugog niza tako sto pravim treci niz
        int niz3[] = new int[veciNiz];
        for (int i = 0; i < niz3.length; i++) {
            //U sledecem uslovu kazem da sabira dva niza sve dok ima clanova manjeg niza (koji god on bio)
            if (i < manjiNiz) {
                niz3[i] = niz1[i] + niz2[i];
            } else {
                //Kada manji niz vise nema clanova onda samo dodeljujem ostale clanove 'pomocnog' niza
                //Svrha kreiranja pomocnog niza je bas zbog ove linije ispod
                niz3[i] = niz[i];
            }

        }

        //------Stampanje

        for (int i = 0; i < niz3.length; i++) {
            System.out.println("Novi niz:");
            System.out.println(niz3[i]);
        }
    }
}
