import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

//        Napraviti program gde cete uneti neki broj i kao rezultat vratiti
//        zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)
        //FOR
        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n= scanner.nextInt();
        int suma=0;
        int i;
        for(i=0; i<n;i++){
            suma=suma+i;
        }
        System.out.println("Suma je: " + suma);
        //------------------------------------------
        //WHILE
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n1= scanner1.nextInt();
        int suma1=0;
        int i1=0;
        while(i1<n){
            suma=suma+i1;
            i1++;
        }
        System.out.println("Suma je: " + suma);
    }
}
