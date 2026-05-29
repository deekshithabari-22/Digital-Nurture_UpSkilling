import java.util.*;
public class PalindromeChecker {

    private static boolean isPal(StringBuilder sb){
        int i=0,j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        StringBuilder temp=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                temp.append(c);
            }
        }
        boolean isPal=isPal(temp);
        System.out.println("The given String "+s+(isPal ? " is " : " is not ")+" a Palindrome.");
        sc.close();
    }
}
