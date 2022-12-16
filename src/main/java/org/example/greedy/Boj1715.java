package org.example.greedy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Boj1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            q.add(temp);
        }
        int hap = 0;
        while (q.size() != 1) {
            int a = q.poll();
            int b = q.poll();
            hap += a + b;
            q.add(a + b);
        }
        System.out.println(hap);
    }
}
