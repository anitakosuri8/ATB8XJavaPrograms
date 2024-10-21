package tasks.task_18102024;

public class StringReverse {
    public static void main(String[] args) {
        String name = "abc";
        char[] reversedArray = new char[name.length()];

        for (int i = 0; i < name.length(); i++) {

            reversedArray[i] = name.charAt(name.length() - 1 - i);
        }

        String reversed = "";//domarP
        for (char c : reversedArray) {
            reversed += c;
        }

        System.out.println("Reversed string: " + reversed);
    }
}
