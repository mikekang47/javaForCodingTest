package org.example;

import java.util.*;

public class UsefulMethod {
    public void test() {
        // Arrays 정렬
        int[] arr = {5, 26, 1, 74, 59, 38};
        Arrays.sort(arr);

        // asList: 배열을 ArrayList로 변환
        Integer[] integers = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        List<Integer> list = Arrays.asList(integers);

        // Collection의 유용한 메서드
        list.size();
//        list.equals();
        list.removeIf((i) -> i.equals(1)); //Predicate
//        list.addAll() // 두 배열 합칠 때
//        list.removeAll()// 공통된 모든 요소 제거
//        list.retainAll() // 공통으로 포함돤 컬렉션만 유지.

        /**
         * Collection 정렬
         */
        list.sort(Comparator.naturalOrder());

        Collections.sort(list);

        /**
         * 최대 최소
         */
        Collections.max(list);
        Collections.min(list);


        /**
         * 부분집합 판별
         */
        Set<Integer> setA = new HashSet<>();
        setA.addAll(List.of(2, 5, 9, 12));

        Set<Integer> setB = new HashSet<>();
        setB.addAll(List.of(3, 6, 9, 12));

        boolean b = setA.containsAll(setB);

        /**
         * 교집합 추출
         */
        setA.retainAll(setB); //setA자체를 변경

        /**
         * 차집합
         */
        setA.removeAll(setB);

        /**
         * Stack
         */
        Stack<String> st = new Stack<>();

        /**
         * Queue
         */
        Queue<String> q = new LinkedList<>();
        q.poll(); // q.pop이랑 같음
        q.peek();

        /**
         * String replace는 반환함.
         * 원본은 안 바뀜.
         *
         * subString(a,b)
         * 인덱스 a부터 b개 가져옴.
         */

        String abc = "abcdef";
        String replace = abc.replace("f", "deg");


    }
}
