package main;

import java.util.Scanner;

public class backjoonN10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), i, j;
        for (i = 0; i < a; i++) {
            for (j = a; j > i + 1; j--)
                System.out.print(" ");
            System.out.print("*");
            for (j = 0; j < i; j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
