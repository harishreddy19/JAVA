// program to list all the files in directory
package labprograms;
import java.io.*;
public class displayfiles {
    public static void main(String[] args) {
        String path ="C:\\Users\\HARISH REDDY\\OneDrive\\Desktop\\iop";
        File directory = new File(path);
        File[] files=directory.listFiles();
        if(files==null){
            System.out.println("no files present in the directory");
            return;
        }
        System.out.println("files in "+ path+":");
        for (File file :files){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }


    }
}
