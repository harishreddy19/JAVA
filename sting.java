import java .util.*;
class Sting 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter  the first string");
        String a=sc.nextLine();
        //System.out.println("enter the second string:");
        //String b=sc.nextLine();
        String even="";
        String odd="";
        for(int i=0;i<a.length();i++)
        {
            if (i%2==0)
            {
                even=even+a.charAt(i);
            }
            else
            {
                odd=odd+a.charAt(i);
            }
        }

       System.out.println("even characters are :"+ even + "   " + " odd characters are :"+ odd); 
    }
}

 