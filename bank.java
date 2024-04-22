import java .util.*;
class bank
{
    public static void main(String[] args)
     {
        
         int balance =50000;
         while(balance!=0)
         {
            System.out.println("enter your choice:");
            System.out.println(" click 1 for credit the amount");
            System.out.println(" click 2 for the withdraw");
            System.out.println("click 3 for the balance");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
         if (a==1)
         {
            System.out.println("enter the amount to be credited:");
            int b=sc.nextInt();
            balance = balance + b; 
         
         }
         
        if (a==2)
        { 
            System.out.println(" enter the amount to be withdraw");
            int d=sc.nextInt();
            balance = balance - d;
        } 
        
        if (a==3)
        {
            System.out.format(" THE CURRENT BALANCE IS %d \n:",balance);
            System.out.println(" THANK YOU");            
        }
        
        if (a>3)
        {
            System.out.println("pls enter correct choice:");
            break;
        
        }
    
    }  
       //a.close(); 
    }
}