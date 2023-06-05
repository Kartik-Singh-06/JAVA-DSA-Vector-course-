import java.util.Scanner;

public class Character_from_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String Value : ");
        String input =sc.nextLine();
        for (int i=0;i<input.length();i++){
            char c =input.charAt(i);
            System.out.print(c+", ");
        }
    }
}
