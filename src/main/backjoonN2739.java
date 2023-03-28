/* Backjoon n.2739
정수를 입력받고, 그 정수의 구구단을 출력하는 프로그램.*/
package main;

import java.util.*;

public class backjoonN2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 1;
        for(i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
