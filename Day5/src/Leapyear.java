import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter then year : ");
        int Year = sc.nextInt();
        if (Year%100==0 && Year%400==0 || Year%100!=0 && Year%4==0){
            System.out.println("It is a leap Year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }
}
