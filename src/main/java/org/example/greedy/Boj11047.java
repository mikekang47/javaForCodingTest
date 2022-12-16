package org.example.greedy;

import java.io.IOException;
import java.util.Scanner;

public class Boj11047 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= A[i]) {
                cnt += (k / A[i]);
                k %= A[i];
            }
        }
        System.out.println(cnt);

    }
}
