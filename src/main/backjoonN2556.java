package main;

import java.util.Scanner;

public class backjoonN2556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), i, j;
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
