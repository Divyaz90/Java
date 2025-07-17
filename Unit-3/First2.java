import java.util.Scanner;

public class First2 {
 public static void main(String[]args){
  Scanner Sc = new Scanner(System.in);
    int age;
    String name;
    System.out.print("Enter your name");
    name = Sc.nextLine();
    System.out.print("Enter your age");
    age = Sc.nextInt();
    if (age>=18)
      System.out.print("eligibility");
      else{
      System.out.print("not eligibility");
   }
 }   
}
