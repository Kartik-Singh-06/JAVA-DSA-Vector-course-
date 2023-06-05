import java.util.Scanner;

public class Digit_of_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = sc.nextInt();

        String sn =Integer.toString(input);
        for (int i=0;i<sn.length();i++){
            System.out.print(sn.charAt(i)+", ");
        }
    }
}
