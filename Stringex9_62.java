import java.util.Scanner;
public class Stringex9_62 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.next();
        String nur = word.toLowerCase();
        String bek = nur.replace(" "," ");
        int count = 0;
        for(int i = 0; i < bek.length(); i++){
       if(bek.charAt(i) == '*'){
           count++;
       }
        }
        count = count +2;
        System.out.println(count);
    }
}