package org.example.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj11724 {
    static ArrayList<Integer>[] graph;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        visited = new boolean[n+1];
        for (int i = 1; i < n+1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        int cnt = 0;
        for(int i = 1; i < n+1; i++) {
            if(!visited[i]) {
                cnt += 1;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int v) {
        visited[v] = true;
        for (int i : graph[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }

    }
}
