import java.util.Scanner;

public class switchstatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and col");
         int row=sc.nextInt(); //3
         int col=sc.nextInt();  //3
         for(int i=0;i<row;i++)
         {
             for(int j=0;j<row-i-1;j++)
             {
               System.out.print(" ");
             }
             for(int j=0;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }

    }
}
