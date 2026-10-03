import java.util.Scanner;
public class CelsiusToFahrenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float c = sc.nextFloat();
        float f = ((c*1.8f)+32);
        System.out.print("Temperature in Fahrenheit: " );
        System.out.printf("%.2f",f);
    }
}