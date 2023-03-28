/* Backjoon n.25314
N을 입력 받고, N바이트 크기의 정수를 만들기 위해 int 앞에 long을 붘여 만들려하는 친구가 있다.
이 친구를 위해 대신해서 프로그램을 짜주자. */

package main;

import java.util.*;

public class backjoonN25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, a = sc.nextInt();
        a /= 4;
        for (i = 0; i < a; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
