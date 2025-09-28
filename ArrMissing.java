import java.util.Arrays;

public class ArrMissing {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};

        System.out.println("The Given Array is : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println("Missing Number: " + (arr[i] + 1));
            }
        }
    }
}