import java.util.Arrays;
import java.util.Scanner;

public class ArrayDSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to test all cases properly take arr = {11, 45, 67, 23, 67, 12, 45}
        System.out.print("Enter the size of your Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of your Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Your Array is: { ");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1)
                System.out.print(arr[i] + " , ");
            else
                System.out.print(arr[i] + " ");
        }
        System.out.println("}");

        System.out.println();

        // To find the largest element
        System.out.println(" To find the largest element ");
        System.out.println();

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element is : " + max);

        System.out.println();
        System.out.println();

        // To find the second Largest element 
        System.out.println(" To mainly find the second largest element ");
        System.out.println();

        int first = arr[0];
        int second = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < first && (second == -1 || arr[i] > second)) {
                second = arr[i];
            }
        }

        System.out.println("First Largest : " + first);
        System.out.println("Second Largest : " + second);

        System.out.println();
        System.out.println();

        // Count frequency of the given number 
        System.out.println(" To count the frequency of a given Number ");
        System.out.println();

        System.out.print("Enter the number to find frequency of : ");
        int x = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Frequency of " + x + " is : " + count);

        System.out.println();
        System.out.println();

        // Reverse the Array 
        System.out.println("Now to reverse an Array");
        System.out.println();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int reverse = arr[start];
            arr[start] = arr[end];
            arr[end] = reverse;
            start++;
            end--;
        }
        System.out.println("Reversed Array : " + Arrays.toString(arr));

        System.out.println();
        System.out.println();

        // To Check if an array is sorted 
        System.out.println(" To check if the array is sorted ");
        System.out.println();

        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break; // break to save extra time preserving time and space 
            }
        }

        if (isSorted) {
            System.out.println("The Array is sorted in ascending order");
        } else {
            System.out.println("The Array is not sorted");
        }

        System.out.println();
        System.out.println();

        // To check the first and last occurrence of element in an array 
        System.out.println(" To Check the First and Last Occurrence ");
        System.out.println();

        System.out.print(" Enter the targeted element to know the first and last element : ");
        int target = sc.nextInt();

        int firstt = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstt == -1) {
                    firstt = i;
                }
                last = i;
            }
        }

        if (firstt == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("First Occurrence : " + firstt);
            System.out.println("Last Occurrence : " + last);
        }

        sc.close();
    }
}
