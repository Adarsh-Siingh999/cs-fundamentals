import java.util.Scanner;
public class PrintGCD {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the 1st number : ");
    int a = sc.nextInt();
    System.out.println();

    System.out.print("Enter the 2nd number : ");
    int b = sc.nextInt();
    System.out.println();
    
    long gcd;
    long x = Math.abs(a);
    long y = Math.abs(b);

    if( x == 0 && y == 0){
     gcd = 0;
     System.out.print("Undefined GCD .. hence printing "+gcd);
    }
    else{

        while( y != 0 ){
            //Euclidian's algorithm
          long remainder =  x % y ;
          x = y ;
          y = remainder ;

        } gcd = x ;
         System.out.print("The GCD / HCF : "+gcd);
    }
     sc.close();
   } 
}
