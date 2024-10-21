package oct.ex_18102024_Strings;

public class Lab146_StrngFnctn {
    public static void main(String[] args) {
        String str=" Anita Kosuri s ";
        //Length of String
        System.out.println("Length:" +str.length());
        //Substring
        System.out.println("Substring:" +str.substring(1,5));//
        //Trim
        System.out.println("Trim:" +str.trim());//Anita Kosuri s
        //Convert to uppercase,lowercase
        System.out.println("Uppercase:" +str.toUpperCase());//ANITA KOSURI S
        System.out.println("Lowercase:" +str.toLowerCase());//anita kosuri s
        //contains
        System.out.println(str.contains("p"));
        System.out.println(str.contains("l"));
        //empty
        System.out.println(str.isEmpty());//n
        //split
        System.out.println(str.split(" "));//n
        //indexof
        System.out.println(str.indexOf('t'));//4
        //CharAt
        System.out.println(str.charAt(2));//n


    }

}
