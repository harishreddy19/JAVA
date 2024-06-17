package labprograms;
class Add extends Thread{
    int a,b;
    public Add(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        System.out.println("sum= "+(a+b));
    }

}
class Sub extends Thread{
    int a,b;
    public Sub(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        System.out.println("sub="+(a-b));
    }

}
class Mul extends Thread{
    int a,b;
    public Mul(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        System.out.println("Mul= "+(a*b));
    }

}
public class multithread {
    public static void main(String[] args) {
        Thread t1= new Add(2,3);
        Thread t2 = new Sub(6,2);
        Thread t3 = new Mul(5,4);
        t1.start();
        t2.start();
        t3.start();
    }
}
