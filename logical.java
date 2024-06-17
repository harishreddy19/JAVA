package operators;
/*
 # logical  operators:
 --> and
 --> or
 --> not
 */
public class logical
 {
    public static void main(String[] args)
     {
        int a= 1;
        int b=2;
        int c=3;
        int d =4;
        //boolean result =a>b && c>d;
        //boolean result =a<b && c<d;
        boolean result =a>b || c<d;
        System.out.println(result);
        
    }
    
}
