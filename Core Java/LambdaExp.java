import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaExp {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
    
        List<String> list=new ArrayList<>();

        System.out.println("Enter the Strings (type done to finish)");

        while(true){
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("done")) break;

            list.add(s);
        }


        // Lambda Expression to sort the list of strings in the reverse lexicographicl order

        Collections.sort(list,(a,b)->(b.compareTo(a)));

        System.out.println("\nList of Strings Sorted in Reverse Lexicographical Order:\n");

        System.out.println(list);

        sc.close();
    }
}
