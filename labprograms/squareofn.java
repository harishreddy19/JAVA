package labprograms;
import java.util.*;
public class squareofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the number range 10 - 50 :");
            int n = sc.nextInt();
            if (n < 10 || n > 50) {
                throw new Exception("out of range");

            }
            int square = n * n;
            System.out.println("The square of the number is: " + square);
        }
        catch(Exception e){
                System.out.println(e);
            }
        }
    }

