package org.example.greedy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Boj1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> yang = new PriorityQueue<>((a, b) -> b - a);
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
        System.out.println(yang);
        while (!yang.isEmpty()) {
            if (yang.size() >= 2) {
                int first = yang.poll();
                int second = yang.poll();
                sum += first * second;
                continue;
            }
            sum += yang.poll();
        }

        while (!yin.isEmpty()) {
            if (yin.size() >= 2) {
                int first = yin.poll();
                int second = yin.poll();
                sum += first * second;
                continue;
            }
            sum += yin.poll();
        }
        sum += one;
        System.out.println(sum);
    }
}
