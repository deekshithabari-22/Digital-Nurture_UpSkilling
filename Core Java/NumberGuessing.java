import java.util.Scanner;
public class NumberGuessing {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int generatedNum=(int)Math.ceil(Math.random()*100);
        boolean guessed=false;
        int cnt=0;
        while(!guessed){
            cnt++;
            System.out.println("Enter a number between 1 and 100:");
            int guess=sc.nextInt();
            if(guess>generatedNum){
                System.out.println("Your guess is too high");
            }
            else if(guess<generatedNum){
                System.out.println("Your guess is too low");
            }
            else{
                guessed=true;
            }
        }
        System.out.println("Yes!! You've guessed it correctly, the number is: "+generatedNum);
        System.out.println("You've guessed it in "+cnt+" attempts");

        sc.close();
   } 
}
