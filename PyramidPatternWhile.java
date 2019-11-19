package pyramid;
import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class PyramidPatternWhile {
public static void main(String args[]){
   try
   {
       Scanner sc = new Scanner(System.in);
       String s;
       int l;
       System.out.println("Enter the String : ");
       s = sc.nextLine();
       l = s.length();
       for(int i=0; i<l;i++)
       {
           int padding = s.length() - i;
           if (padding> 0) {
               System.out.printf("%" + padding + "s", " ");
           }
           for(int j=0;j<i;j++)
           {
               System.out.printf("%c ",s.charAt(j));
           }
           System.out.printf("%c\n",s.charAt(i));
       }         

   }
   catch(Exception e)
   {
       System.err.println(e);
   }
}
}
