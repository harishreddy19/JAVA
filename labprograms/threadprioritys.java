package labprograms;
import java.io.*;
import java.util.*;
class a extends Thread{
    public void run(){
        System.out.println("welcome to java program");
    }
}
class b extends Thread{
    public void run(){
        System.out.println(" example program for thread priorites");
    }
}
public class threadprioritys {
    public static void main(String[] args) {
        Thread t1 = new a();
        Thread t2 = new b();
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
