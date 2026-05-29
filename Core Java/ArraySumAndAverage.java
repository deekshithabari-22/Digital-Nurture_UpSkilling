import java.util.Scanner;
import java.util.Arrays;
public class ArraySumAndAverage {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        System.out.println("Enter the elements of the array in space separated manner:");

        int[] arr=new int[n];
        int sum=0;
        double average=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            average+=arr[i];
        }
        System.out.println("The sum of the Array elements "+(Arrays.toString(arr))+" is: "+sum);

        System.out.println("The average of the Array elements "+(Arrays.toString(arr))+" is: "+(average/n));

        sc.close();
   } 
}
