package number1;
import java.util.Scanner;
public class scan {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter the size of your array");
    int size=scan.nextInt();
    int[] arr=new int [size];
        for (int i=0;i<=size; i++)
    {
        arr[i] = scan.nextInt();
    }
        System.out.println("enter the numbers to be searched:");
         int numToBeSearched=Scanner.nextInt();
         int linearSearch(int[] arr, int target) {
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numToBeSearched) {
                return arr[i];
            }
        }
             System.out.println("the number u have searched for is:"+arr[i]);

}
