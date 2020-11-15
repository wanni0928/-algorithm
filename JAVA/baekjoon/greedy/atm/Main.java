package algorithm.baekjoon.greedy.atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public int solution(Integer[] people){
        List<Integer> sums = new ArrayList<>();
        Arrays.sort(people);
        int sum = 0;
        for (Integer person : people) {
            sums.add(sum += person);
        }

        return sums.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        Integer[] ints = new Integer[length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println(new Main().solution(ints));
    }
}
