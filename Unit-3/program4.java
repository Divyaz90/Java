import java.util.Scanner;

public class program4{
public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number");
    int n,i,sum=0,rem;
    n = sc.nextInt();
    for(i=1;i<=5;i++){
        rem = n%10;
        n = n/10;
        sum=sum+rem;
    }
    System.out.println("sum="+sum);

    }
}
