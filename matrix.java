import java.util.*;
class matrix
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("eter the row size and column size:");
        int row =sc.nextInt();
        int column=sc.nextInt();
        int a [][] = new int[row][column];
        int b[][] = new int[row][column];
        int c[][] = new int[row][column];
        System.out.println("enter the elements of the  first matrix:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of the  second matrix:");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                b[i][j]=sc.nextInt();
            }
    
         }
         for(int i=0;i<b.length;i++)
         {
            for(int j =0;j<a.length;j++)
            {
                for (int k=0;k<a.length;k++)
                {
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        } 
        System.out.println("The Product matrix :");
        for(int i=0;i<c.length;i++)
        {
            for(int j =0;j<c.length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        } 
  }
}