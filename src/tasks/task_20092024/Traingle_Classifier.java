package tasks.task_20092024;

import java.util.Scanner;

public class Traingle_Classifier {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the length of side 1: ");
            double side1 = sc.nextDouble();

            System.out.print("Enter the length of side 2: ");
            double side2 = sc.nextDouble();

            System.out.print("Enter the length of side 3: ");
            double side3 = sc.nextDouble();


            if (side1 >= 1 && side2 >= 1 && side3 >= 1) {

                if (side1 == side2 && side1 == side3 && side2 == side3) {
                    System.out.println("Eq");
                } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                    System.out.println("ISO");
                } else {
                    System.out.println("scalene");
                }
            } else {
                System.out.println("Are you mad?, Negative sides");
            }
        }
}
