package oct.ex_23102024_Exception;

public class Lab171_Finally {
    public static void main(String[] args) {
        try {
            int c = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("End");
        }
//        finally {
//        }
    }
}
