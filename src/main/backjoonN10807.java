package main;

import java.util.*;

public class backjoonN10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i;
        int[] a = new int[n];
        for(i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int v = sc.nextInt(), result = 0;
        for(i = 0; i < n; i++) {
            if(a[i] == v)
                result += 1;
        }
        System.out.println(result);
    }
}
