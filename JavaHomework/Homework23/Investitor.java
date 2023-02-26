package Homework23;

public class Investitor extends Radnik {
     int broj_zgrada;

    public Investitor(int id, String naziv_radnika, int godine_iskustva, double plata, int broj_zgrada) {
        super(id, naziv_radnika, godine_iskustva, plata);
        this.broj_zgrada = broj_zgrada;
        if(broj_zgrada>=5){
            this.plata=plata*1.3;
        }
    }
    public void stampa(){
        System.out.println(this.naziv_radnika + " (ID broj " + this.id + "), ima " + this.godine_iskustva + " godina radnog iskustva.");
        System.out.println("Sagradio je " + this. broj_zgrada + " zgrada i placen je " + this.plata + " evra." );
    }
}
