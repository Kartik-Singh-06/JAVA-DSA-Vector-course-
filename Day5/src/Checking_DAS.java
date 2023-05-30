import java.util.Scanner;

public class Checking_DAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input : ");
        char input =sc.next().charAt(0);
        if (Character.isAlphabetic(input)){
            System.out.println("It is a alphabet");
        } else if (Character.isDigit(input)) {
            System.out.println("It is a Digit ");
        } else if (!Character.isDigit(input)&& !Character.isLetter(input)&&!Character.isWhitespace(input)) {
            System.out.println("It is a Special Character ");
        }
        else {
            System.out.println("It's not a digit, alphabet or Special Character. ");
        }

    }
}
