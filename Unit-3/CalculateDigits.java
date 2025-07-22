
import java.util.Scanner;


public class CalculateDigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean istrue = true;
        int num,sum=0;
        char ch;
        while(istrue){
            System.out.print("Enter the number");
            num=sc.nextInt();
            sum = sum + num;
            System.out.println("more num  ");
            System.out.println("Do you want to add more number?  ");
    
            ch = sc.next().charAt(0);
            if(ch =='f'||ch =='F'){
            istrue = false;
        }
            else if (ch =='t'|| ch == 'T') {
               System.out.println("okk");
        }
            else{
                System.out.println("please answer is t or f");
        }
        
    }
    System.out.println("Sum is : "+sum);
        }
}



    