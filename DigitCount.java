import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int count ;
        System.out.println();

        if(number == 0){
        count = 1 ;
        }else{
            count= 0 ;
            while(number>0){
                number = number / 10 ;
                count++;
            } System.out.print("The digit count is : " +count);
        }
       
        sc.close();
    }
}
