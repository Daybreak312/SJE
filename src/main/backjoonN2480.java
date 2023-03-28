/* Backjoon n.2480
세 개의 주사위를 굴리고, 눈에 따라 상금을 받는 게임.
1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. */

package main;

import java.util.*;

public class backjoonN2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        if (d1 == d2 && d1 == d3)
            System.out.println(10000 + d1 * 1000);
        else if (d1 == d2 || d1 == d3)
            System.out.println(1000 + d1 * 100);
        else if (d2 == d3)
            System.out.println(1000 + d2 * 100);
        else if (d1 > d2 && d1 > d3)
            System.out.println(d1 * 100);
        else if (d2 > d1 && d2 > d3)
            System.out.println(d2 * 100);
        else
            System.out.println(d3 * 100);
    }
}