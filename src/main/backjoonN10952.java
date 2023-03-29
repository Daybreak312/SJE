package main;

import java.util.*;

public class backjoonN10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), i;
        while(a != 0) {
            System.out.println((a + b));
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
