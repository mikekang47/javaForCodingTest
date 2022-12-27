package org.example.baekjoon;

import java.util.Scanner;

public class Boj1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = 1;
			int b = 0;
			for (int j = 0; j < n; j++) {
				int temp = a;
				a = b;
				b = temp + b;
			}
			System.out.println(a + " " + b);
		}
	}
}
