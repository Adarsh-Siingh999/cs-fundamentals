import java.util.Scanner;
public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println();

        System.out.print("Enter the Elements of the Array : ");
        for( int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }System.out.println();
        int delBegin[] = new int[n-1];

        // To delete the begining Element 
        for( int i = 1 ; i < n ; i++){
            delBegin[i-1] = arr[i];
        }
        System.out.print("The new Array after Deletion = ");
        for( int i = 0 ; i < delBegin.length ; i++){
        System.out.print(delBegin[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        
        // To delete any Element in between the Array

        System.out.print("Enter the position of the Index from 1 to " + n + " to be deleted : ");
        int position = sc.nextInt();
        int delMid[] = new int[n-1];
        System.out.println();

        //* Copying the Elements before the position

        for(int i = 0 ; i < position - 1 ; i++){
        delMid[i] = arr[i];
        }

        //* Shifting the remaining elements to the left by 1 place 

        for(int i = position ; i < n ; i++ ){
            delMid[i-1] = arr[i];
        }

        System.out.print("The new Array after given deletion is : ");
        for(int i = 0 ; i < delMid.length ; i++){
            System.out.print(delMid[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();



        // Deletion of the last Element of the Array
        int delEnd[] = new int[n-1];
        for(int i = 0 ; i < n-1 ; i++){
        delEnd[i] = arr[i];
        }
        System.out.print("The new Array after deleting the last Element : ");
        for(int i = 0 ; i < delEnd.length ; i++){
        System.out.print(delEnd[i] + " ");
        }

        sc.close();
    }
  
}
