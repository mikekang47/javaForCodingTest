package org.example.search;

import java.util.Scanner;

public class Boj2023 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int v, int place) {
        if (place == n) {
            if (isPrime(v)) {
                System.out.println(v);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if(i % 2==0) {
                continue;
            }
            if (isPrime(v * 10 + i)) {
                DFS(v * 10 + i, place + 1);
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
