import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        //        1. Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel

        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite neki broj :");
        int broj= scanner.nextInt();
        int faktorijel=1;
        for(int i=broj; i>=1; i--){
            faktorijel=faktorijel*i;
        }
        System.out.println("Faktorijel od broja " + broj + " je " + faktorijel);
    }
}
