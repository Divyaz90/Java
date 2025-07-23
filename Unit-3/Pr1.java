import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                {
                int a,b;
                System.out.println("Enter the first number: ");
                a = sc.nextInt();
                System.out.println("Enter the second number: ");
                b = sc.nextInt();
                System.out.println("sum of" + a + "and" + b +" = " + (a+b));
                  break;
                }
                  case 2:
                  {
                      int a,b;
                      System.out.println("Enter the number");
                      a = sc.nextInt();
                      System.out.println("Enter the second number");
                      b = sc.nextInt();
                      System.out.println("sub of" + a + "and" + b + " = " + (a-b));
                      break;
                  }
                //    case 3:
                //    {
                //     int a,b;
                //     System.out.println("Eneter the first number: ");
                //     a = sc.nextInt();
                //     System.out.println("Enter thye second number: ");
                //     b = sc.nextInt();
                //     System.out.println("Multiplication of" * a * "and" * b *" = " * (a*b));
                //    }
                // case 4:
                // {
                //     System.out.println("Enter the first number: ");
                //     a = sc.nextInt();
                //     System.out.println("Enter the second number: ");
                //     b = sc.nextInt();
                //     System.out.println("div of");
                }
                
            }while(true);

        }
}
