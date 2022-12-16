package org.example.Array;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class boj11286 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(
                (i, j) -> Math.abs(i) != Math.abs(j) ? Math.abs(i) - Math.abs(j) : i - j
        );

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int command = sc.nextInt();
            if (command != 0) {
                pq.add(command);
                continue;
            }
            if(pq.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(pq.poll());
            }
        }
    }
}
