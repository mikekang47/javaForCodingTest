package org.example.Array;

import java.io.IOException;
import java.util.Scanner;

public class boj10986 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] s = new long[n];
        long[]c = new long[m];
        long result = 0;
        s[0] = sc.nextInt();
        for(int i =1; i < n; i++) {
            s[i] = s[i-1] + sc.nextInt();
        }
        for(int i = 0; i <n; i++) {
            int r = (int)(s[i] % m);
            if(r == 0)
                result += 1;
            c[r] += 1;
        }

        for(int i = 0; i < m; i++) {
            if(c[i] > 1) {
                result += (c[i] * (c[i]-1) / 2);
            }
        }
        System.out.println(result);
    }
}
