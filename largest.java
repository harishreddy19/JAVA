import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number");
        int a = sc.nextInt();
        System.out.print("enter the second number");
        int b = sc.nextInt();
        System.out.print("enter the third number");
        int c = sc.nextInt();
        if (a>b && a>c)
        {
           System.out.format("%d is greater",a);
        }
        else if(b>c)
        {
            System.out.format("%d is greater",b);
        } 
        else
        {
            System.out.format("%d is greater",c);
        } 
        sc.close();
    }
}