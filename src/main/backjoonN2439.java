package main;

import java.util.*;

public class backjoonN2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}