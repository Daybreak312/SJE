package main;

import java.util.*;

public class backjoonN11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), i, a, b;
        for(i = 1; i <= t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}
