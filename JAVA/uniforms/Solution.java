package algorithm.programmers.uniforms;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // n        전체 학생의 수
        // lost     잃어버린 학생들의 번호
        // reverse  여벌의 체육복을 가져온 학생들의 번호
        int answer = 0;
        Map<Integer, Integer> students = new HashMap<>();
        for (int i = 0; i < n; i++) {
            students.put(i + 1, 1);
        }
        for (int i : lost) {
            students.put(i, students.getOrDefault(i,0) - 1);
        }
        for (int i : reserve) {
            students.put(i, students.getOrDefault(i,0) + 1);
        }
        System.out.println(students);
        for (int i : lost) {
            if(students.get(i) == 0){
                if(students.get(i-1) != null) {
                    if(students.get(i-1) == 2){
                        students.put(i, students.getOrDefault(i,0) + 1);
                        students.put(i-1, students.getOrDefault(i-1,0) - 1);
                    }
                }else if(students.get(i+1) != null){
                    if(students.get(i+1) == 2) {
                        students.put(i, students.getOrDefault(i,0) + 1);
                        students.put(i+1, students.getOrDefault(i+1,0) - 1);
                    }
                }
            }
        }
        System.out.println(students);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : students.entrySet()) {
            if(integerIntegerEntry.getValue() >= 1) answer++;
        }
        return answer;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(24, new int[]{12,13,16,17,19,20,21,22}, new int[]{1,22,16,18,9,10}));
    }
}
