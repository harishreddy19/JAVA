package labprograms;
class dog{
    void eat(){
        System.out.println("example");
    }
}
public class superkey extends dog {
    void eat(){
        super.eat();
        //System.out.println("program");

    }

    public static void main(String[] args) {
        dog a =new dog();
        a.eat();
    }
}

