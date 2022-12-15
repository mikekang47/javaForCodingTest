package org.example.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String number = br.readLine();
        int solution = ArrayProblem.solution(n, number);
        System.out.println(solution);
    }

    public static int solution(int n, String number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            numbers.add(num);
        }
        return numbers.stream()
                .mapToInt(i -> i)
                .sum();
    }
}
