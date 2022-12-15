package org.example.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        double result = solution(n, arr);
        System.out.println(result);

    }

    private static double solution(int n, String[] arr) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(arr[i]));
        }

        int maxValue = Collections.max(numbers);
        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += (double)numbers.get(i)/ maxValue * 100.0;

        }
        return sum / n;
    }
}
