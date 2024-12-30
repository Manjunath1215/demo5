import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age>=18)
        {
             System.out.println("eligiable for vote ");
        }
        else
        {
            System.out.println("better try next year");
        }
    }
}
