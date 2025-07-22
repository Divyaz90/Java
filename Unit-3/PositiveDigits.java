
import java.util.Scanner;

public class PositiveDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0,num;
        int neg = 0;
        int zero = 0;
        char ch;
        while (true) {
            num = sc.nextInt();
            if (num > 0)
                pos++;
            if (num < 0)
                neg++;
            if (num == 0)
                zero++;
            System.out.println("Enter more ");
            ch = sc.next().charAt(0);
            if(ch == 'f' || ch == 'F'){

                break;
            }
            else if (ch == 't' || ch == 'T'){

                System.out.println("okk");
            }
            else{

                System.out.println("Enter t|f");            
            } 
        }
    }
}
