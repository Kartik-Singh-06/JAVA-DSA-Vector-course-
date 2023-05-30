import java.util.Scanner;

public class Cal_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student name : ");
        String Studentname = sc.nextLine();
        System.out.print("Enter the marks of Maths : ");
        int maths =sc.nextInt();
        System.out.print("Enter the marks of Physics : ");
        int phy =sc.nextInt();
        System.out.print("Enter the marks of Chemistry : ");
        int chem =sc.nextInt();
        System.out.print("Enter the marks of English : ");
        int eng =sc.nextInt();
        System.out.print("Enter the marks of Hindi : ");
        int hindi =sc.nextInt();

        int Sum = maths+phy+chem+eng+hindi; //Sum to total  marks obtain in Subjects.
        int totalmarks = 500; //Total marks of 5 subjects.
//        Percentage formula.
        double percentage = (Sum*100)/totalmarks;

        if(percentage>=90){
            System.out.println("Your Grade is A and percentage is " + percentage+"%");
        } else if (percentage>=80 && percentage<=89) {
            System.out.println("Your Grade is B and percentage is" +percentage+"%");
        } else if (percentage>=70 && percentage<=79) {
            System.out.println("Your grade is C and percentage is "+percentage+"%");
        } else if (percentage>=60 && percentage<=69){
            System.out.println("Your Grade is D and percentage is "+ percentage+"%");
        } else if (percentage>=40 && percentage<=59){
            System.out.println("Your Grade is E and percentage is " +percentage+"%");
        }else {
            System.out.println("Your grade is F (Fail) and percentage is "+percentage +"%");
        }

    }
}
