package com.programmers.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int idx = 0;
        int timePoint = 0;
        int length = jobs.length;

        Queue<int[]> queue = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        while(idx < length || ! queue.isEmpty()){
            while(idx < length && jobs[idx][0] <= timePoint) queue.offer(jobs[idx++]);

            if(queue.isEmpty()) timePoint = jobs[idx][0];
            else {
                int[] job = queue.poll();
                answer += timePoint - job[0] + job[1];
                timePoint += job[1];
            }
        }

        return answer/length;
    }

}

class DiskControllerTest {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1,9}, {2, 6}};
        DiskController diskController = new DiskController();
        System.out.println(diskController.solution(jobs));
    }
}
