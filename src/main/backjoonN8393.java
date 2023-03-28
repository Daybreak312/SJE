/* Backjoon n.8393
n을 입력 받고 1부터 n까지의 수를 더하는 프로그램. */
package main;

import java.util.*;

public class backjoonN8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(((n + 1) * n / 2));
    }
}
