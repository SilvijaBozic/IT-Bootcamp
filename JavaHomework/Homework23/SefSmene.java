package Homework23;

public class SefSmene extends Radnik {
    public SefSmene(int id, String naziv_radnika, int godine_iskustva, double plata) {
        super(id, naziv_radnika, godine_iskustva, plata);
        if(godine_iskustva>5){
            this.plata=plata*1.2;
        }
    }
    public void stampa(){
        System.out.print(this.naziv_radnika + " (ID broj " + this.id + "), iza sebe ima ");
        System.out.println(this.godine_iskustva + " godina iskustva i platu " + this.plata  + " evra.");
    }
}
