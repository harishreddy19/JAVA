package labextprt;

public class nestedtry {
    public class Main {
        public static void main(String[] args) {
            try {

                int result = 10 / 2;

                try {

                    int[] array = new int[5];
                    array[10] = 100;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }

            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            //System.out.println("Rest of the code...");
        }


    }
}
