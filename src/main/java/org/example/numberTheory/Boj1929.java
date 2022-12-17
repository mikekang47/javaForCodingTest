package org.example.numberTheory;

import java.util.Scanner;

public class Boj1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i = m; i <= n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
