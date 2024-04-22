//import java.io.*;
import java.util.*;
class sorting
{
    public static void main(String[] args) 
    {
        int n = 4;
        String names[]={"rahul ","harish","jaheer","ajay"};
        Arrays.sort(names);
        System.out.println("the names in alphabetical order");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}
