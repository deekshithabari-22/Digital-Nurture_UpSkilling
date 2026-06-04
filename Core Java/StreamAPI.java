import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
public class StreamAPI {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    List<Integer> nums=new ArrayList<>();
    while(true){
        System.out.println("Enter 1 to make an entry or 2 to finish");
        int id=sc.nextInt();
        if(id==2) break;
        System.out.println("Enter the number:");
        int val=sc.nextInt();
        nums.add(val);
    }

    
    Stream<Integer> even=nums.stream().filter(a->(a%2==0));

    System.out.println("Even numbers:");
    even.forEach(System.out::println);
    sc.close();
   } 
}
