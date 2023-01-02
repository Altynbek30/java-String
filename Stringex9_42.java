import java.util.Scanner;
public class Stringex9_42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char b;
        for ( int i = word.length()-1; i>=0; i-- ) {
            b = word .charAt(i);
            System.out.print(b);
        }
    }
}