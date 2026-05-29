import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string to reverse it:");
       String s=sc.nextLine();
       
       String rev=(new StringBuilder(s).reverse()).toString();

       System.out.println("The reversed string of "+s+" is :"+rev);

       sc.close();
    }
}
