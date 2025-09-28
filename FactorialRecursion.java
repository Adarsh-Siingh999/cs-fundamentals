import java.util.Scanner;

public class FactorialRecursion {
    
    // Recursive function to calculate factorial
    static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive step: n * factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calling recursive function
        long result = factorial(num);
        
        // Printing result
        System.out.println("Factorial of " + num + " is: " + result);
        
        sc.close();
    }
}
