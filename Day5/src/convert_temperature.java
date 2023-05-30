import java.util.Scanner;

public class convert_temperature {
    public static void main(String[] args) {

        //Converting Temperature Fahrenheit to Celsius.

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Temperature in celsius : ");
        double c = sc.nextDouble();

        double f = (c*9/5)+32;
        System.out.println("The Converted temp Celsius " +c+ " to fahrenheit " + f);
    }
}
