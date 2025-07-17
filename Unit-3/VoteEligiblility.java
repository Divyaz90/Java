import java.util.Scanner;

public class VoteEligiblility {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int age;
        String name;
        System.out.print("Enter your name");
         name = sc.nextLine();
        System.out.print("Enter your age");
        age = sc.nextInt();
         if(age>=18){
            System.out.println(name +"("+age+")you are eligibility");
        }
      else{
        System.out.println(name +"("+age+")you are not eligibility");
      }
    }
}
            