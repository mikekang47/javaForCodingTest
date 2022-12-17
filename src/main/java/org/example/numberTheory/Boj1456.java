package org.example.numberTheory;

import java.util.Scanner;

public class Boj1456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long[] A = new long[10000001];
        for (int i = 2; i < A.length; i++) {
            A[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(A.length); i++) {
            if (A[i] == 0)
                continue;
            for (int j = i + i; j < A.length; j = j + i) {
                A[j] = 0;
            }
        }
        int count = 0;
        for (int i = 2; i < 10000001; i++) {
            if (A[i] != 0) {
                long temp = A[i];
                while ((double) A[i] <= (double) n / (double) temp) {
                    if ((double) A[i] >= (double) m / (double) temp) {
                        count++;
                    }
                    temp = temp * A[i];
                }
            }
        }
        System.out.println(count);
    }
}
