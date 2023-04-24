package main;

import java.util.*;

public class backjoonN1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, cnt = 0;
        do {
            temp = temp % 10 * 10 + (temp / 10 + temp % 10) % 10;
            cnt++;
        } while (num != temp);
        System.out.println(cnt);
    }
}