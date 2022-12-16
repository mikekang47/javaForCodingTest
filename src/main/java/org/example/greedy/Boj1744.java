package org.example.greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Boj1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> yang = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> yin = new PriorityQueue<>();
        int one = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > 1) {
                yang.add(temp);
            } else if (temp == 1) {
                one += 1;
            } else if (temp == 0) {
                zero += 1;
            } else {
                yin.add(temp);
            }
        }
        int sum = 0;

        while (yang.size() > 1) {
            int first = yang.remove();
            int second = yang.remove();
            sum += first * second;
        }

        if (!yang.isEmpty()) {
            sum += yang.remove();
        }

        while (yin.size() > 1) {
            int first = yin.remove();
            int second = yin.remove();
            sum += first * second;
        }
        if (!yin.isEmpty()) {
            if (zero == 0)
                sum += yin.remove();
        }
        sum += one;
        System.out.println(sum);
    }
}
