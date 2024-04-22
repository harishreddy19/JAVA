import java.util.*;
class even
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter any number :");
        int n=Sc.nextInt();
        if (n%2==0)
        {
            System.out.format("%d is a even nunber",n); 
        }
        else
        {
            System.out.format("%d is a odd number",n);// hello
        }
    Sc.close();
    }

}