import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+ n +" elements");

        for(int i = 0 ; i < n ;i++){
             arr[i] = sc.nextInt();
        }

        // Acessing the elements 
        System.out.println("The Elements are :");
        for(int i =0 ; i < n ; i++){
            System.out.print(arr[i] + "  " );
        }System.out.println();

        //Sum of the Elements
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        System.out.println("The Sum Of All Elements is :"+sum);

        // Multiplication at even indicies
        System.out.println("The Multiplication at even indicies are :");
        int product = 1;

        for(int i = 0 ; i < n ; i+=2){
            product *= arr[i];
        }
        System.out.println(product);

        // Average of All Elements 
        System.out.println("Average :");
        double average = (double) sum / n ;
        System.out.println("The Average is :" +average);
      
        sc.close();
    }
}
