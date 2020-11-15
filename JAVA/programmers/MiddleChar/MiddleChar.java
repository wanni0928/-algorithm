package com.programmers.algorithm;

public class MiddleChar {
    public String solution(String s) {
        String answer = "";
        int middle = s.length() / 2;
        if(s.length() % 2 == 0) {
            answer = s.substring(middle - 1, middle + 1);
        }else {
            answer = s.substring(middle, middle + 1);
        }

        return answer;
    }
}

class MiddleCharTest {
    public static void main(String[] args) {
        String s = "qwerd";
        MiddleChar middleChar = new MiddleChar();
        System.out.println(middleChar.solution(s));
    }
}
