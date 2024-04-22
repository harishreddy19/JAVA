public class ConstructorOverloading {

    public String name;
    public int age;

    public ConstructorOverloading() {
        System.out.println("This is a deafualt Constructor");
    }

    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This ia a 2 parametrized Constrructor");
    }

    public ConstructorOverloading(String name) {
       System.out.println("This ia a 1 parametrized Constrructor");
        this.name = name;
    }

    public static void main(String[] args) {
       ConstructorOverloading n = new ConstructorOverloading();
        ConstructorOverloading n1 = new ConstructorOverloading("Jack", 64);
    }
}
