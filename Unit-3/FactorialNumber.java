
import java.util.Scanner;

public class FactorialNumber {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int factorial = 1;
         System.out.println("Enter the number");
         n = sc.nextInt();

        while(n>=1){
            factorial=factorial * n--;
        }
        System.out.println( factorial);
    }
}


    

    
