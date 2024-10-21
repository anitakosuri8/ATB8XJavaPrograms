package oct.ex_21102024_exception;

public class Lab158 {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10 / c;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e); // / by zero
        }
    }
}
