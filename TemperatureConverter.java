import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
        
        scanner.close();
    }
    
    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
// Enter temperature in Celsius: 65.8
// Temperature in Fahrenheit: 150.44
// Enter temperature in Fahrenheit: 87.8
// Temperature in Celsius: 31.0
