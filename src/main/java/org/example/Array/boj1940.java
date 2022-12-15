package org.example.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt = 0;
        int i = 0;
        int j = n-1;
        while(i < j) {
            if(arr[i] + arr[j] < m) {
                i++;
            } else if(arr[i] + arr[j] > m) {
                j--;
            } else {
                i ++;
                j --;
                cnt += 1;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
