package tasks.task_20092024;
import java.util.Scanner;
public class FizzBuzz_Test {
    public static void main(String[] args) {
        // FizzBuzz Problem
        // Write a program that prints numbers from 1 to n.(100)
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5,
        // print "FizzBuzz."
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = 100");
        int n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
