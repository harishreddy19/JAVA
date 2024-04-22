import java.util.*;
class positive
{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);
        System.out.print("enter any number");
        int a=Sc.nextInt();
        if(a<0)
        {
            System.out.format("%d is negative",a); 
        }
        else if (a>0)
        {
            System.out.format("%d is positive",a);
        }
        else 
        {
            System.out.format("%d is zero",a);
        }
        Sc.close();
    }
}