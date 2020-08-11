package com.programmers.algorithm;

import java.util.Arrays;

public class ProgrammingSort {
    public void arrayPush(int[] array, int value, int top){
        int[] new_array = new int[array.length + 1];
        System.arraycopy(array, 0, new_array, 0, array.length);
        array = new_array;
        array[top] = value;
    }

    public int[] solution(int[] progresses, int[] speeds) {int[] answer = {};
        int[] days = new int[speeds.length];
        int idx = 0;
        for (int progress : progresses){
            days[idx] = (100 - progress) % speeds[idx] == 0 ? (100 - progress) / speeds[idx] : (100 - progress) / speeds[idx] + 1;
            idx++;
        }

        int cnt = 0;
        int compare = days[0];
        int answerIdx = 0;
        idx = 0;
        while(idx != days.length){
            if(days[idx] <= compare){
                cnt++;
                idx++;
                if(idx == days.length){
                    int[] new_array = new int[answer.length + 1];
                    System.arraycopy(answer, 0, new_array, 0, answer.length);
                    answer = new_array;
                    answer[answerIdx++] = cnt;
                }
            }else {

                int[] new_array = new int[answer.length + 1];
                System.arraycopy(answer, 0, new_array, 0, answer.length);
                answer = new_array;
                answer[answerIdx++] = cnt;

                compare = days[idx];
                cnt = 0;
            }
        }
        return answer;
    }
}
class ProgrammingSortSolution {
    public static void main(String[] args) {
//        int[] progresses = {93,30,55};
//        int[] speeds = {1,30,5};
//        int[] progresses = {93, 30, 55, 60};
//        int[] speeds = {1, 30, 5, 40};
        int[] progresses = {93, 30, 55, 60};
        int[] speeds = {0, 0, 0, 0};

        ProgrammingSort ps = new ProgrammingSort();
        ps.solution(progresses, speeds);
    }
}