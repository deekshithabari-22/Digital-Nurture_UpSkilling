import java.util.Scanner;
public class RecursiveFibonacci {
    private static int getNthFibNum(int n){
        if(n<=2) return n-1;
        return getNthFibNum(n-1)+getNthFibNum(n-2);
    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer n, to get nth fibonacci number:");

        int n=sc.nextInt();
        int fibNum=getNthFibNum(n);

        System.out.println("The "+n+"th Fibonacci number is: "+fibNum);

        sc.close();
   } 
}
