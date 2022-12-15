package org.example.Array;

import java.util.Scanner;

public class boj2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + i;
        }
        int i = 0;
        int j = 1;
        int cnt = 0;
        while (i < j && j <= n) {
            if(arr[j] - arr[i] > n) {
                i += 1;
            } else if(arr[j] - arr[i] < n) {
                j += 1;
            } else if(arr[j] - arr[i] == n) {
                cnt += 1;
                i += 1;
                j += 1;
            }
        }
        System.out.println(cnt);
    }
}
