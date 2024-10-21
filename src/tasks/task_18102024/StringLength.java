package tasks.task_18102024;

public class StringLength {
    public static void main(String[] args) {
        //Calculate the length of the String - without using the length() function.
        // String name =”Pramod”; →  6 , CharArray, for loop
        String name = "Pramod";
        int length = 0;
//        for (int i = 0; ; i++) {
//            if (i < name.length()) {
//                length++;
//            } else {
//                break;
//            }
//  }
        // Using a for loop to iterate through the string
        for (char c : name.toCharArray()) {
            length++;
        }
        System.out.println("Length of the string: " + length);
            }
        }


