import java.util.Scanner;
 
public class codeforsesquiz5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();            //даем число
        int z = sc.nextInt();              //пишем сколко раз крутится 
 
        for (int i = 0; i < z; i++ ) {           //создаем фор и крутим
            if(x%10 != 0) {                     //если последние чесло не равен 0 то -1
                x = x - 1; 
            } else if (x%10 == 0) {                //если последния чесло равен 0 то делим на 10
                x = x/10; 
            } 
        }
        System.out.println(x);
    }
}