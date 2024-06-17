package labprograms;
import java.io.*;

public class readlinebyline {
    public static void main(String[] args) {
        try {
            char arr[] = new char[100];
            FileReader file = new FileReader("demo.txt");
            BufferedReader in = new BufferedReader(file);
            in.read(arr);
        }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }

