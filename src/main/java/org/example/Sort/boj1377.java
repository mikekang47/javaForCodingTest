package org.example.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class boj1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Data[] a = new Data[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Data(Integer.parseInt(br.readLine()), i);
        }
        List<Data> collect = Arrays.stream(a)
                .sorted(Comparator.comparingInt(i -> i.value))
                .collect(Collectors.toList());

        int Max = 0;
        for (int i = 0; i < n; i++) {
            if (Max < collect.get(i).index - i) {
                Max = collect.get(i).index - i;
            }
        }
        System.out.println(Max + 1);
    }

    static class Data {
        private int value;
        private int index;

        public Data(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
