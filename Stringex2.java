import java.util.Scanner;
class Stringex2{
 public static void  main(String [] agrs){
  Scanner in = new Scanner(System.in);
  String word = in.next();
  String word2 = in.next();
  String word3 = in.next();

  boolean res = word.equals(word2);
  boolean res1= word.equals(word3);

  System.out.println("word2 :"+res);
  System.out.println("word3 :"+res1);
  }
 }