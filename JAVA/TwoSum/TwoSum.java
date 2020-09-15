package com.programmers.algorithm;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TwoSum {
    public int[] solution(int[] numbers) {
        Set<Integer> setList = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j) setList.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[setList.size()];
        int idx = 0;
        for (Integer integer : setList) {
            answer[idx] = integer;
            idx++;
        }

        return answer;
    }
}

class TwoSumTest {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.solution(numbers)));
    }
}