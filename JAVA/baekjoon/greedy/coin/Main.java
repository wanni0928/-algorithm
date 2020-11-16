package algorithm.baekjoon.greedy.coin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(Integer[] coins, int balance) {
        Arrays.sort(coins, (o1, o2) -> o2 - o1);
        int coinCnt;
        int totalCnt = 0;
        for (Integer coin : coins) {
            if(balance == 0) {break;}
            if(balance >= coin) {
                coinCnt = balance / coin;
                balance = balance - (coin * coinCnt);
                totalCnt += coinCnt;
            }
        }
        return totalCnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(new Main().solution(A, K));
    }
}
