package algorithm.baekjoon.greedy.Rope;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(Integer[] ropes, int length) {
        Arrays.sort(ropes, (o1, o2) -> o2 - o1);
        int result = 0;
        for (int i = length; i > 0; i--) {
            result = Math.max(result, ropes[i - 1] * i);
        }
        return result;
    }

    public static void main(String[] args) {
        // k : 로프의 갯수
        // w : 물체의 무게
        // w/k : 물체를 여러 로프로 끌어올릴때 각각의 로프에 걸리는 중량
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        Integer[] ropes = new Integer[length];
        for (int i = 0; i < ropes.length; i++) {
            ropes[i] = scanner.nextInt();
        }

        System.out.println(new Main().solution(ropes, length));
    }
}
