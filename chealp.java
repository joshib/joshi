


import java.io.IOException;
import java.util.Scanner;


public class Alpha {

   
    public static void main(String[] args)throws IOException {
       Scanner in= new Scanner(System.in);
       char ch;
       System.out.println("Enter the character");
       ch=(char)System.in.read();
       if(Character.isLetter(ch))
       {
           System.out.println("The given character is an alphabet");
       }
       else
           System.out.println("The given character is not an alphabet");
    }
    
}
