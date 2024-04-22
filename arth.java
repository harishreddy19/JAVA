//operators in java
//arthmatic operators....

import java .util.*;
class arth
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        int c = a+b;
        System.out.format("the addition of two numbers is %d \n",c);
        int d = a-b;
        System.out.format("the subtraction of two numbers is %d \n",d);
        int e = a*b;
        System.out.format("the multiplaction of two numbers is %d \n",e);
        int f = a%b;
        System.out.format("the reminder of two numbers is %d \n",f);
sc.close();
    }
}