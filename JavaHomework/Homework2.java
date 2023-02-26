import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input date of birth :");
        int yearOfBirth= scanner.nextInt();
        System.out.println("Input current year :");
        int currentYear= scanner.nextInt();
        int broj_godina= currentYear - yearOfBirth;
        System.out.println("You are: " + broj_godina + " years old.");

    }
}
