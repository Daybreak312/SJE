package main;

import java.util.*;

public class backjoonN2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), i, j;
        for (i = a; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
