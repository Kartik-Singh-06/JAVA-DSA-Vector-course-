import java.util.Scanner;

public class Checking_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input : ");
        char input = sc.nextLine().charAt(0);
        if(input == 'a' || input == 'e' ||input == 'i' ||input == 'o' ||input == 'u'  ){
            System.out.println("It's a vowels.");
        }
        else {
            System.out.println("It is not a vowels.");
        }
    }
}
