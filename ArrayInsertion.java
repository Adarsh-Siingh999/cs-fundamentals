import java.util.Scanner;
public class ArrayInsertion {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array :");
    int n = sc.nextInt();
    int arr[] = new int [n];

    System.out.println("Enter the elements of the array : ");
    for(int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
    }System.out.println();

    // Inserting element in the first place
     
    System.out.print("Enter the elememt to be inserted at 1st place : ");
    int x1 = sc.nextInt();

    int newArr1[] =new int[n+1];

    //* Assign the x1 place
    newArr1[0] = x1;

    //* Copying the Elements
    
    for( int i = 0 ; i < n ; i++){
    newArr1[i+1] = arr[i];
    }

    System.out.print("The new Array is : ");
    for(int i = 0 ; i <= n ; i++){
        System.out.print(newArr1[i]+ " ");
    }System.out.println();
    System.out.println();
    System.out.println();

    // Inserting Element in between 

    System.out.print("Enter the element to be inserted in between the Array : ");
    int x2 = sc.nextInt();
    System.out.println();

    int newArr2[] = new int[n+1];

    System.out.print("Enter the position in which you want to place this element from (1 to " + ( n )+ " ): ");
    int position = sc.nextInt();

    // Copying the elements before the new elements 

    for( int i = 0 ; i < position-1 ; i++ ){
        newArr2[i] = arr[i];
    }

    // Assigning the new at the required position
    newArr2[position-1] = x2;

    // Copying remaining elements and shifting them to thr right by 1

    for(int i = position ; i <= n ; i++ ){
        newArr2[i] = arr[i-1];
    }
    System.out.println();

    System.out.print("The new Array after inserting in between : ");
    for( int i = 0 ; i < newArr2.length ; i++){
        System.out.print(newArr2[i]+ "  ");
    }System.out.println();
    System.out.println();
    System.out.println();

    // Inserting Element at Last 
    
    System.out.print("Enter the element to be inserted at last :");
    int x3 = sc.nextInt();
    System.out.println();

    int newArr3[] = new int[n+1];

    //Copying the elements
    for(int i = 0 ; i < n ; i++){
        newArr3[i] = arr[i];
    }

    //Assigning the last position
    newArr3[n] = x3;

    System.out.print("The Final Array is :");
    for( int i = 0 ; i < newArr3.length ; i++ ){
        System.out.print(newArr3[i]+ "  ");
    }
    sc.close();
 }  

}
