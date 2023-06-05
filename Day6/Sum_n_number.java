import java.util.Scanner;

public class Sum_n_number {
    public static void main(String[] args) {
        int input,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Input : ");
        input = sc.nextInt();
       for (int i =1 ; i<=input ; i++){
           sum += i;
       }
        System.out.print("The sum of n natural number is : "+sum);
    }
}
