package com.programmers.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoMoreSameNum {
    public List<Integer> solution(int []arr) {
//        int[] answer = null;
        List<Integer> arList = new ArrayList<>();
        for (int num : arr) {
            if(arList.size() == 0) {
                arList.add(num);
            }else {
                if(arList.get(arList.size() - 1) == num) {
                    continue;
                }else {
                    arList.add(num);
                }
            }
        }
        System.out.println(arList);

        return arList;
    }
}

class NoMoreSameNumTest {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        NoMoreSameNum noMoreSameNum = new NoMoreSameNum();
        System.out.println(noMoreSameNum.solution(arr));
    }
}