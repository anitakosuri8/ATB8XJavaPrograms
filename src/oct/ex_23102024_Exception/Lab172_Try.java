package oct.ex_23102024_Exception;

public class Lab172_Try {
    public static void main(String[] args) {
        try {
            int c =  10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
