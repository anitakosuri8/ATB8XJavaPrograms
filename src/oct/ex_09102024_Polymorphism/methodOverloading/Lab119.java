package oct.ex_09102024_Polymorphism.methodOverloading;

public class Lab119 {
    public static void main(String[] args) {
        MathOperators m=new MathOperators();

        int result1=  m.add(3,4);
        System.out.println(result1);

        double result2=  m.add(32.2,31.2);
        System.out.println(result2);

        String result3=  m.add("Anita","Durga");
        System.out.println(result3);

        double result5=  m.add(3.2,3.6,3.1f);
        System.out.println(result5);

        m.add(1,2,3);


    }
}
