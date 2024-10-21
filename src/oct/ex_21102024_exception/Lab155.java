package oct.ex_21102024_exception;

public class Lab155 {
    public static void main(String[] args) {

        // Checked - JVM knows
//        FileInputStream file = new FileInputStream("C://a.txt");
        // JVm knows this that file may not exist


        // UnChecked Exception - ArithmeticException
        int a = 10;
        int c = a/0;
        System.out.println(c);

    }
}
