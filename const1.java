class abc
{
    abc(String name,int age)
    {
        System.out.println(name+" "+age);
    }
    public void details(String name,int age,String branch)
    {
        System.out.println(name+" "+age+" "+branch);
    }
}
public class const1 {
    public static void main(String[] args) {
      abc obj=new abc("ram",18);
      obj.details("ajay",19,"cse");
    }
}
