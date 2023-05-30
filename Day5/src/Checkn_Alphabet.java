import java.util.Scanner;

public class Checkn_Alphabet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Input");
        char input = sc.nextLine().charAt(0);
        if (Character.isAlphabetic(input)){
            System.out.println("It is a Alphabet");
        }else {
            System.out.println("It is not a alphabet");
        }
    }
}
