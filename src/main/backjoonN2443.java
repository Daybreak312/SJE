package main;

import java.util.*;

public class backjoonN2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), i, j;
        for(i = 0; i < a; i++) {
            for (j = 0; j <= i -1; j++) {
                System.out.print(" ");
            }
            for (j = a; j > i; j--) {
                System.out.print("*");
            }
            for (j = a; j > i + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
