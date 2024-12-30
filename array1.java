import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and col");
        int row=sc.nextInt();        //3
        int col=sc.nextInt();       //3

        int[][] a=new int[row][col];
        int[][] b=new int[row][col];
        int[][] c=new int[row][col];

        System.out.println("Enter the elements of 1st matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of 2 matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {                            //for(int k=0;k<col;k++)
                c[i][j]=a[i][j]+b[i][j]; //c[i][j]=c[i][j]+a[i][k]*b[k][j]
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    c[i][j] = c[i][j] + a[i][k] * c[k][j];
                }
            }
        }

        for(int i=0;i<c.length;i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
        }
            System.out.println();
            }


    }
}
