package oct.ex_18102024_Strings;

public class Lab145_StrngEquals {
    public static void main(String[] args) {
        String s1="Hello";//SCP
        String s4="Hello";//SCP
        String s2=new String("Hello");//Object Area
        String s3=new String("Hello");//Object Area
        String s5=new String("hello");//Object Area


        //== checks for Reference location
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//false
        System.out.println(s1 == s4);//true
System.out.println("****");

        //equals checks for values
        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s3.equals(s5));//false
        System.out.println(s3.equalsIgnoreCase(s5));//true


    }

}
