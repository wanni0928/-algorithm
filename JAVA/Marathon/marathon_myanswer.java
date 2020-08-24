package com.company;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String person : participant) {
            if(hm.get(person) == null) {
                hm.put(person, 1);
            }else {
                hm.put(person, hm.get(person) + 1);
            }
        }

        for (String competitor : completion){
            if(hm.get(competitor) != null){
                hm.put(competitor, hm.get(competitor) - 1);
            }
        }

        Iterator hmIterator = hm.entrySet().iterator();

        while(hmIterator.hasNext()){
            Map.Entry map = (Map.Entry) hmIterator.next();
            if(map.getValue().equals(1)) {
                answer = map.getKey().toString();
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Solution solution = new Solution();
        solution.solution(participant, completion);
    }
}
