import java.util.Scanner;
public class Average {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        char a;
        System.out.println("Enter a number");
        a = sc.next().charAt(0);
        switch (a){
            case 'A','a' -> System.out.println("Execellent");
            case'B','b' -> System.out.println("Good");
            case'C','c' -> System.out.println("Average");
            case'D','d' -> System.out.println("Fail");
            default -> System.out.println("Enter the wrong grade");

        }
    }

}