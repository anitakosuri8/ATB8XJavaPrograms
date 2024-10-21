package tasks.task_18102024;

public class PalindromeCheck {
        public static void main(String[] args) {
            String str1 = "abba";
            String str2 = "pramod";

            System.out.println(str1 + " → Output: " + isPalindrome(str1));
            System.out.println(str2 + " → Output: " + isPalindrome(str2));
        }

        public static String isPalindrome(String str) {

            for (int i = 0; i <str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return "No"; // Not a palindrome
                }
            }
            return "Yes"; // Is a palindrome
        }
    }


