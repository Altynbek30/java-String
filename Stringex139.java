import java.util.Scanner;

public class Stringex139{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String text = "Dadffaksjd21j"
	char c1;
	boolean c;
	for(int i =0;i<text.length();i++){
	c1 =text.charAt(i);
	c  =Character.isDigit(c1);
	if (c){
	System.out.println(c1);
	}
	}
	}
}