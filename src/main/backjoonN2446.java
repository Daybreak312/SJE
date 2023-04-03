package main;

import java.util.*;

public class backjoonN2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, a = sc.nextInt();
        for (i = 0; i < a; i++) {
            for (j = 0; j < i; j++)
                System.out.print(" ");
            for(j = a; j > i; j--)
                System.out.print("*");
            for (j = a; j > i + 1; j--)
                System.out.print("*");
            System.out.println();
        }
        for (i = 1; i < a; i++) {
            for (j = a; j > i + 1; j--)
                System.out.print(" ");
            for (j = 0; j < i + 1; j++)
                System.out.print("*");
            for (j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
