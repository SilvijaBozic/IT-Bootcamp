import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {

//        Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
//        na kraju treba ispisati najveci broj od onih koje smo uneli.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite velicinu niza:");
        int velicina_niza=scanner.nextInt();
        int niz[]=new int[velicina_niza];
        int trenutni_max=Integer.MIN_VALUE;

        for(int i=0;i<velicina_niza;i++){
            System.out.println("Unesite broj:");
            niz[i]= scanner.nextInt();

            if(trenutni_max<niz[i]){
                trenutni_max=niz[i];
            }
        }
        System.out.println("Najveci broj u nizu je : " + trenutni_max);
    }
}
