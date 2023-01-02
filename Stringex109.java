import java.util.Scanner;

public class Stringex109{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextlnt();
	String word ="Hello world";
	char uwEl = word.charAt(a);
	String newWord = word.replace(""+uwEl,"");
	System.out.println(newWord);
	}
}