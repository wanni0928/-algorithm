package com.programmers.algorithm;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrossingTrucks {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        int nextTruck = 0;

        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        for (int truck : truck_weights) {
            trucks.add(truck);
        }
        int firstTruck = trucks.poll();
        sum += firstTruck;
        bridge.add(firstTruck);
        answer++;

        while(sum != 0){
            if(bridge.size() == bridge_length){
                sum -= bridge.poll();
            }

            if( trucks.size() != 0 && sum + trucks.peek() <= weight){
                nextTruck = trucks.poll();
                sum += nextTruck;
                bridge.add(nextTruck);
            }else {
                bridge.add(0);
            }
            answer++;
        }

        return answer;
    }
}

class Solution{
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        CrossingTrucks ct = new CrossingTrucks();
        System.out.println(ct.solution(bridge_length, weight, truck_weights));
    }
}
