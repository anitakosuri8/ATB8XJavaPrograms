package tasks.task_25102024;

import java.util.Scanner;

public class Downward_Pyramid {
    //*********
    // *******
    //  *****
    //   ***
    //    *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num n=5");
        int n = sc.nextInt();

        for (int i = n; i >=1; i--) {
            for(int j =n; j >i ; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1); j++) {//5 1<=1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


