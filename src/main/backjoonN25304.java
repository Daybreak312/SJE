package main;

import java.util.*;

public class backjoonN25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, total1 = sc.nextInt(), total2 = 0, repeat = sc.nextInt(), a, b;
        for (i = 0; i < repeat; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            total2 += a * b;
        }
        if (total1 == total2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
