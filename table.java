import java.util.*;
class table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.format("%d * %d = %d \n",a,i,a*i);
        }
        sc.close();
    }
}