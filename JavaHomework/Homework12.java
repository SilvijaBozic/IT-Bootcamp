import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
//        3. Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
//        kruske 100 din i banane 140 din, tako da se suma
//        racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
//        toliko dodajemo na sumu, kada se unese ".",
//        program izlazi iz petlje i pise ukupnu cenu navedenog voca.

        Scanner scanner=new Scanner(System.in);
        int suma=0;
        int cena_jabuka=50;
        int cena_banana=140;
        int cena_krusaka=100;
        String voce;
        while (true){
            System.out.println("Unesite naziv voca :");
            voce= scanner.next();
            if(voce.equals("jabuka")){
                suma=suma+cena_jabuka;
                System.out.println("Suma je :" + suma);
            }
            if(voce.equals("banana")){
                suma=suma+cena_banana;
                System.out.println("Suma je :" + suma);
            }
            if(voce.equals("kruska")){
                suma=suma+cena_krusaka;
                System.out.println("Suma je :" + suma);
            }if(voce.equals(".")){
                System.out.println("Ukupna cena voca: " + suma);
                break;
            }
        }
    }
}
