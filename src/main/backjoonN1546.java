package main;

import java.util.*;

public class backjoonN1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        double max = 0, sum = 0;
        double[] literal = new double[1000];
        for (int i = 0; i < sub; i++) {
            literal[i] = sc.nextDouble();
            if (max < literal[i])
                max = literal[i];
        }

        for (int i = 0; i < sub; i++) {
            literal[i] = literal[i] / max * 100;
            sum += literal[i];
        }

        System.out.println(sum / sub);
    }
}