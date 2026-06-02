import java.util.Scanner;
public class ExceptionExample {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    try{
        int result=a/b;
        System.out.println("Result: "+result);
    }
    catch(ArithmeticException e){
        System.out.println("Error: Cannot divide by zero.");
    }
    finally{
        sc.close();
    }
   } 
}
