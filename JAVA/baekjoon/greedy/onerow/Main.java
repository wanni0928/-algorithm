package algorithm.baekjoon.greedy.onerow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] tallAr = new int[N];
        List<Integer> tallSort = new ArrayList<>();

        for (int i = 0; i < tallAr.length; i++) {
            tallAr[i] = scanner.nextInt();
        }

        for (int i = N; i > 0; i--) {
            tallSort.add(tallAr[i - 1], i);
        }

        for (Integer tall : tallSort) {
            System.out.print(tall + " ");
        }
    }
}
