package com.programmers.algorithm;

public class OneTwoFour {
    public String solution(int n) {
        String[] nums = {"4", "1", "2"};
        StringBuilder answer = new StringBuilder();
        int remain = 0;
        while(n > 0){
            remain = n % 3;
            n /= 3;
            if(remain == 0) n--;
            answer.insert(0, nums[remain]);
        }
        return answer.toString();
    }

}

class OneTwoFourTest {
    public static void main(String[] args) {
        OneTwoFour oneTwoFour = new OneTwoFour();
        System.out.println(oneTwoFour.solution(513));
        System.out.println(1 % 3);
    }
}
