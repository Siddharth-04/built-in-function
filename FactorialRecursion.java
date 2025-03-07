import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        
        scanner.close();
    }
    
    private static long calculateFactorial(int n) {
        if(n <= 1) return n;
        return n*calculateFactorial(n-1);
    }
}
// Enter a number: 5
// Factorial of 5 is: 120

