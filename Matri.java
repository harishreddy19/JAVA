// THIS IS HOW TWO MATRIX IS MULTLIPED IN JAVA
import java.util.Scanner;

class Matri
{
    public static void main(String args[])
    {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n enter the base sqared matrix");
    n = sc.nextInt();
    int[][] a = new int[n][n];
    int[][] b = new int[n][n];
    int[][] c = new int[n][n];
    System.out.println("\n Enter the elements of the first matrix row wise\n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("\n Enter the elements of the second matrix row wise\n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            b[i][j]=sc.nextInt();
        }

    }
    System.out.println("multipling the matrices");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
        }
    }
    System.out.println("the product is");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.println(c[i][j]+" ");
        }
        System.out.println();
    }
    }
}
