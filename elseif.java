import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
    if(a>=b)
    {
        if(a>=c)
        {
           System.out.println(a+"is large");
        }
        else
        {
            System.out.println(c+"is large");
        }
    }
    else
    {
        if(b>=c)
        {
            System.out.println(b+"is large");
        }
        else
        {
           System.out.println(c+"is large");
        }
    }
    }
}
