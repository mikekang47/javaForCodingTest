package org.example.Array;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Deque<Node> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            while (!dq.isEmpty() && dq.getLast().value > temp) {
                dq.removeLast();
            }
            dq.addLast(new Node(temp, i));
            if(dq.getFirst().index <= i - l) {
                dq.removeFirst();
            }
            bw.write(dq.getFirst().value +" ");
        }
        bw.flush();
        bw.close();
    }

    static class Node {
        private int value;
        private int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
