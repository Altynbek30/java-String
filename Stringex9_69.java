import java.util.Scanner;
public class Stringex9_69 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.next();
        int count =0;

          for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                count++;
            }
        }
        count = count + 1;
        System.out.println(count);
    }
}
        