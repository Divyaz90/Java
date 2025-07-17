
import java.util.Scanner;

public class First3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        int num;
        //String percent;
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your number: ");
        num=sc.nextInt();
        if(num>=90){
              System.out.println(name  +  " you got A+ grade");


        }
       else if(num>=80){
              System.out.println(name  +  " you got A grade");


        }
       else if(num>=70){
              System.out.println(name  +  "you got b+ grade");


        }
      else  if(num>=60){
              System.out.println(name  +  " you got b grade");


        }
       else if(num>=50){
              System.out.println(name + " you got c+ grade");


        }
       else if(num>=40){
              System.out.println(name  +  " you got c grade");


        }
      else  if(num<=40){
              System.out.println(name   +  " you got D grade");


        }
        else{
              System.out.println(name  +  " you are fail");
        }

    }
    
}
