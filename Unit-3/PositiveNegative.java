import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number");
        num = sc.nextInt();
        if (num>0) {
            System.out.println("Positive number");
        } 
        else if(num<0) {
            System.out.println("Negatve number");
        }
            else {
            System.out.println("The number is Zero");
           }
        }
    }
