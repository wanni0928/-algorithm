package com.programmers.algorithm;

import java.util.PriorityQueue;

public class Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovilleQ = new PriorityQueue<>();
        for (int sco : scoville){
            scovilleQ.add(sco);
        }

        int mixedScoville;
        int firstMin;
        int secMin;
        while (scovilleQ.size() > 1 && scovilleQ.peek() < K){
            firstMin = scovilleQ.poll();
            secMin = scovilleQ.poll();
            mixedScoville = firstMin + (secMin * 2);
            scovilleQ.add(mixedScoville);
            answer++;
        }
        if(scovilleQ.size() <= 1 && scovilleQ.peek() < K) answer = -1;
        return answer;
    }
}

class SpicyTest {
    public static void main(String[] args) {
        //case01
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 99;

        Spicy spicy = new Spicy();
        System.out.println(spicy.solution(scoville, k));
    }
}
