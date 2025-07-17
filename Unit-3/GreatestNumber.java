import java.util.Scanner;

public class GreatestNumber{
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int var1;
        int var2;
        System.out.print("Enter the first value"); 
        var1 = sc.nextInt();
            System.out.println("Enter the Second value");
            var2 = sc.nextInt();
            if(var1>var2){
            System.out.println(var1+ " is greater");
            }
            else{
            System.out.println(var2+" is greater");
        }
     }
}