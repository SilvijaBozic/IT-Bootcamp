package Homework23;

import Homework22.Radnik;

public class Main {
    public static void main(String[] args) {

//        Zadatak 1.
//        Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata.
//        Klase Fizikalac, SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati
//        dodatno polje za broj zgrada koje je do sada digao. Istampati njihove podatke sa tim
//        da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva
//        i 30% vecu platu investitoru ako je digao bar 5 zgrada.

        Radnik r1=new Radnik(1, "Fizikalac", 6, 1000);
        Radnik r2=new Radnik(2, "Sef smene", 4, 1500);
        Radnik r3=new Radnik(3, "Investitor", 5, 2000);

        Fizikalac f1=new Fizikalac(r1.id, r1.naziv_radnika, r1.godine_iskustva, r1.plata);
        SefSmene s1=new SefSmene(r2.id, r2.naziv_radnika, r2.godine_iskustva, r2.plata);
        Investitor i1=new Investitor(r3.id, r3.naziv_radnika, r3.godine_iskustva, r3.plata, 5);

        f1.stampa();
        s1.stampa();
        i1.stampa();
    }
}
