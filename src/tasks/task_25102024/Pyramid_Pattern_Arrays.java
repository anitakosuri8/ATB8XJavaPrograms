package tasks.task_25102024;

import java.util.Scanner;

public class Pyramid_Pattern_Arrays {
    //    *
//       ***
//      *****
//     *******
//    *********
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num n=5");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
