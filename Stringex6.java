import java.util.Scanner;
class Stringex6{
 public static void  main(String [] agrs){
   Scanner in = new Scanner(System.in);
   String baha = in.nextLine();
   int length = baha.length();

   String subword = baha.substring(0, length / 2);  String subword2 = baha.substring(length / 2, length);
   System.out.println(subword2 + "" + subword);
       }
   }