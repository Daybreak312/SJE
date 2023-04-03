package main;

import java.util.Scanner;

public class backjoonN10990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, a = sc.nextInt();
        for (i = 0; i < a; i++) {
            for (j = a; j > i + 1; j--)
                System.out.print(" ");
            System.out.print("*");
            for (j = 0; j < i; j++)
                System.out.print(" ");
            for (j = 1; j < i; j++)
                System.out.print(" ");
            if (i > 0)
                System.out.print("*");
            System.out.println();
        }
    }
}
