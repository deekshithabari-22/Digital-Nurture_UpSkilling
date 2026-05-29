import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the marks out of 100:");
       int marks=sc.nextInt();
       char grade='0';
       if(marks>=90 && marks<=100){
        grade='A';
       }
       else if(marks>=80 && marks<=89){
        grade='B';
       }
       else if(marks>=70 && marks<=79){
        grade='C';
       }
       else if(marks>=60 && marks<=69){
        grade='D';
       }
       else{
        grade='F';
       }
       System.out.println("Grade for the marks  "+marks+" is :"+grade);
    }
}
