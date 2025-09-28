import java.util.Scanner;
public class SumRecursion {
    public static long sum(long n){
        if(n == 1){
            return 1;
        } else {
            return n + sum(n-1);
        }
    }    

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long n = sc.nextLong();
        System.out.println("The sum of natural numbers till "+n+" is : "+sum(n));
        sc.close();
        }
    
}
