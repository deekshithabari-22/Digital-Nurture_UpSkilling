import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class FileWriting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to write to output.txt: ");
        String s=sc.nextLine();
        try{
            FileWriter fw=new FileWriter("output.txt");
            fw.write(s);
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}