package tasks.task_25102024;

import java.util.Scanner;

public class LeftTraingle_Arrays {
    //*****
    //****
    //***
    //**
    //*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num n=5");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}