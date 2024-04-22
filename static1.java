public class static1
{
    static int x = 10;
    static int y;
    static void fun(int z){
        System.out.println("X="+x);
        System.out.println("Y="+x);
        System.out.println("Z="+z);
    }
    static{
        System.out.println("This is a static block");
        y = x+5;
    }
    public static void main(String[] args) {
        fun(4);
    }
}
