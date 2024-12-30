@FunctionalInterface
interface E
{
    int add(int a,int b);
}
public class exception1 {
    public static void main(String[] args)
    {
     E obj=(a,b) -> (a+b);  //lambda expression
         int r=obj.add(5,1);
         System.out.println(r);
    }
}
