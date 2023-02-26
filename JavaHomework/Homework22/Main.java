package Homework22;

public class Main {
    public static void main(String[] args) {
//        Zadatak 2.
//        Napraviti klasu Radnik koja ima ime, poziciju i platu.
//        U glavnoj klasi napraviti dva radnika, proveriti cija je plata veca,
//        istampati informacije radnika cija je plata veca, uz 20% vecu platu.

        Radnik radnik1 = new Radnik("Pera", "domar", 40000);
        Radnik radnik2 = new Radnik("Mile", "stolar", radnik1.plata*1.2);
//        System.out.println(radnik1.plata);
//        System.out.println(radnik2.plata);
        if (radnik1.plata> radnik2.plata){
            System.out.println(radnik1.ime + " ima 20 % vecu platu od " + radnik2.ime + ".");
        }else {
            System.out.println(radnik2.ime + " ima 20 % vecu platu od " + radnik1.ime + ".");

        }
    }
}
