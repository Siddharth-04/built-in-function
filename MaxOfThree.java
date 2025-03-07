import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: " );
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: " );
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: " );
        int num3 = scanner.nextInt();
        
        int max = findMax(num1, num2, num3);
        
        System.out.println("The maximum number is: " + max);
        
        scanner.close();
    }
    
    public static int findMax(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            
            return b;
        }

        return c;
    }
}
// Enter first number:
// 1
// Enter second number:
// 2
// Enter third number:
// 3
// The maximum number is: 3
