import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Enter the first value"); 
        num1 = sc.nextInt();
         System.out.println("Enter the Second value");
         num2 = sc.nextInt();
         System.out.println("Enter the Third value");
         num3 = sc.nextInt();

            if(num1>num2){
            System.out.println(num1+" is Largest");
            }
            else if(num2>num3){
            System.out.println(num2+" is Largest");
            }
            else{
                System.out.println(num3+" is Largest");
            }
        }
     }

    
