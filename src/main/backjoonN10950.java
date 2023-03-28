/* Backjoon n.10950
N과 N 쌍의 두 수를 입력받고, 그 수를 더한 결과를 출력하는 프로그램. */

package main;

import java.util.*;

public class backjoonN10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, t = sc.nextInt(), a, b;
        for(i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println((a + b));
        }
    }
}
