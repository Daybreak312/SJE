/*
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class backjoonN16396 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), start, end, max = 0, l = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            start = sc.nextInt();
            end = sc.nextInt();

            for (int j = start; j <= end; j++) {

                max = max > start ? max : start;
                list.set(j, 1);
            }
        }

        for (int i = 1; i <= max; i++)
            if (list.get(i) == 1)
                l += 1;

        System.out.println(l);
    }
}
*/
