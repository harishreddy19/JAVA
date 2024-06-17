package labprograms;
public class OuterClass {
    class a{
        void display(){
            System.out.println("example programe for inner class");
        }
    }
    public void call(){
        a inner =new a();
        inner.display();

    }

    public static void main(String[] args) {
        OuterClass b =new OuterClass();
        b.call();
    }
}
