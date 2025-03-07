import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
    
    private static int calculateGCD(int a, int b) {
        return (b == 0) ? a : calculateGCD(b, a % b);
    }
    
    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
// Enter first number: 4
// Enter second number: 8
// GCD of 4 and 8 is: 4
// LCM of 4 and 8 is: 8

