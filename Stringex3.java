import java.util.Scanner;
class Stringex3{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();
    boolean t1 = word.startsWith("N");
    boolean t2 = word.endsWith("N");
    System.out.println(t1);
    System.out.println(t2);
   }
}