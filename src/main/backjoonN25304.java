/* Backjoon n.25304
틀릴 수도, 맞을 수도 있는 총 가격 X와 상품의 종류 개수 N, 각각의 종류에 따른 가격과 개수를 입력 받고
이에 따른 총 값과 X를 비교하면 동일하면 Yes, 다르다면 No를 출력하는 프로그램. */
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
