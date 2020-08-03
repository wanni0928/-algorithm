package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class SpyClothes {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hm = new HashMap<>();
        int[] a = null;
        for(int i = 0; i < clothes.length; i++){
            String name = clothes[i][0];
            String type = clothes[i][1];
            if(!hm.containsKey(type)) {
                hm.put(type, 0);
            }
            hm.put(type, hm.get(type) + 1);
        }
        Iterator hmIterator = hm.entrySet().iterator();
        while(hmIterator.hasNext()){
            Map.Entry map = (Map.Entry) hmIterator.next();
            answer *=  ((Integer) map.getValue() + 1);
        }
        answer--;

        return answer;
    }

    public static void main(String[] args) {
        String[][] strings = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        SpyClothes sol = new SpyClothes();
        sol.solution(strings);
    }
}
