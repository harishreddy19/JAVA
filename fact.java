import java.util.*;
class java
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int factorial =1;
        for ( int i=1;i<=n;i++) 
        factorial *= i;
        System.out.println("the factorial is " + factorial);
    }
}
// factorial = factorial * i
