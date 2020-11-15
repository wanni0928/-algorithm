package com.programmers.algorithm;
import java.util.Stack;

public class Crane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (Integer move : moves) {
            int moveIdx = move - 1;
            for (int i = 0; i < board.length; i++) {
                int crane = board[i][moveIdx];
                if(crane == 0) continue;
                if(!stack.empty() && stack.peek() == crane){
                    stack.pop();
                    answer++;
                } else {
                    stack.push(crane);
                }
                board[i][moveIdx] = 0;
                break;
            }
        }
        return answer * 2;
    }
}

class CraneTest {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        Crane crane = new Crane();

        System.out.println(crane.solution(board, moves));
    }
}
