package algorithm.baekjoon.greedy.change;

import java.util.Scanner;

public class Main {
    public int solution(int price){
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};
        int totalChange = 1000 - price;
        int coinCnt = 0;
        int totalCnt = 0;
        for (int coin : coins) {
            if(totalChange == 0){
                break;
            }else {
                if(totalChange >= coin){
                    coinCnt = totalChange / coin;
                    totalChange = totalChange - (coin * coinCnt);
                    totalCnt += coinCnt;
                }
            }
        }

        return totalCnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        System.out.println(new Main().solution(price));
    }
}
