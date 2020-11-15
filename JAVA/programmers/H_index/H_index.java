import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] num = new Integer[citations.length];
        for(int i = 0; i < citations.length; i++){
            num[i] = citations[i];
        }

        Arrays.sort(num, Collections.reverseOrder());   
        while(answer < citations.length){
            if(num[answer] <= answer){
                break;
            }
            answer++;
        }

        return answer;
    } 
}