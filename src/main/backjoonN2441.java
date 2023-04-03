package main;

import java.util.*;

public class backjoonN2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), i, j;
        for (i = a; i > 0; i--) {
            for (j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
