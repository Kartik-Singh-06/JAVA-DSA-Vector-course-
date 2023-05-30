import java.util.Scanner;

public class Check_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input : ");
        char input =sc.nextLine().charAt(0);
        if(Character.isDigit(input)){
            System.out.println("It's a Digit.");}
        else {
            System.out.println("It's not a Digit.");
        }
    }
}
