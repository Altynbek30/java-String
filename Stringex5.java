import java.util.Scanner;
class Stringex5{
 public static void  main(String [] agrs){
        Scanner in = new Scanner (System.in);
        String word = in.nextLine();
        int san = word.length();
        String subword = word.substring(0,san/2);

        System.out.println(subword);
    }
}