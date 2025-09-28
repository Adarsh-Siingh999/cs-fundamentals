public class Factorial {
    public static int factorial(int x){
        if (x == 0 || x == 1 ){
            return 1 ;
        } else {
            return x * factorial(x-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("factorial of : ");
       System.out.print( factorial(5));
    }
}
