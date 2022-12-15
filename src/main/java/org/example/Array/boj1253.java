package org.example.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer sc = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(sc.nextToken());
        }
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < n; i++) {
            long target = arr[i];
            int start = 0;
            int end = n - 1;
            while (start < end) {
                if (arr[start] + arr[end] == target) {
                    if (start != i && end != i) {
                        result += 1;
                        break;
                    } else if (start == i) {
                        start += 1;
                    } else if (end == i) {
                        end -= 1;
                    }
                } else if (arr[start] + arr[end] < target) {
                    start += 1;
                } else {
                    end -= 1;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
