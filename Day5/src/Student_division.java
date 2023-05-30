import java.util.Scanner;

public class Student_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the % Student : ");
        int percentage = sc.nextInt();
        if (percentage>=60 && percentage<=100){
            System.out.println("Student Got 1 divison marks "+percentage+ "%");
        }
        else if(percentage>=45 && percentage<=59){
            System.out.println("Student got 2 division " +percentage+ "%");
        }
        else if(percentage>=30 && percentage<=44){
            System.out.println("Student got 3 division " +percentage+ "%");
        } else if (percentage>100) {
            System.out.println("Percentage is not Valid ");

        } else {
            System.out.println("Student fail in Result " +percentage+ "%");
        }
    }
}
