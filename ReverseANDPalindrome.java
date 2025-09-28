import java.util.Scanner;
public class ReverseANDPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be reversed : ");
        long number = sc.nextLong();   // original input
        long original = number;        // save a copy for palindrome checking

        long reverse = 0;

        // Work with absolute value (ignore sign while reversing)
        long temp = Math.abs(number);

        while(temp > 0){
            long lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }

        // if number was negative, make reverse negative
        if(number < 0){
            reverse = -reverse;
        }

        System.out.println("Reversed Number : " + reverse);

        // Checking palindrome: compare original and reversed
        boolean isPalindrome = (original == reverse);
        System.out.println("Is palindrome? " + isPalindrome);

        sc.close();
    }
}
