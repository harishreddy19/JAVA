package labprograms;
// FinalExample.java
    class Vehicle {
        final int Speed = 100;

        final void show() {
            System.out.println("Maximum Speed: " + Speed);
        }
    }

    public class finalkey {
        public static void main(String[] args) {
            Vehicle a = new Vehicle();
            a.show();
        }
    }


