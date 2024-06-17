package labprograms;
public class Multiplecatchblock {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=a/0;
            System.out.println("result is"+b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }




    }
}
