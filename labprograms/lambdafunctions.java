package labprograms;
import java.util.*;
public class lambdafunctions {
    public static void main(String[] args) {
        List <Integer> an= Arrays.asList(5,4,3,7,8,2,1);
        System.out.println("origional list :"+an);
        an.sort((a,b)->a.compareTo(b));
        System.out.println("sorted list ="+an);
    }
}
