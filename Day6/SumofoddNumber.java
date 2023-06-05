import java.util.Scanner;

public class SumofoddNumber {
    public static void main(String[] args) {
        int input,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Input : ");
        input=sc.nextInt();
        for (int i =1; i<=input ; i++){
            sum+=2*i-1;
        }
        System.out.print("The sum of odd Natural Number is : " +sum);
    }
}
