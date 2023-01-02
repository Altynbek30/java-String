import java.util.Scanner;
public class Stringex9_70 {
    public static void main(String[] args) {
        String word ="H*e+ll+o Jav*a";
        char vowels [] = {'+','*'};
        word = word.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < word.length(); i++ ){
            char c= word.charAt(i);

            for(int j = 0; j<vowels.length;j++){
            if (c == vowels[j]){
                count++;
            }
          }
        }
        System.out.println(count);
    }
}