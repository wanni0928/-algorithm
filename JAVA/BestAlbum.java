package com.company;

import java.util.*;
import java.util.stream.Stream;

public class BestAlbum {

    public int find(int[] array, int value) {
        for(int i=0; i<array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = null;
        Set<String> gSet = new HashSet<String>(Arrays.asList(genres));
        Map<String, List<Integer>> hm = new HashMap<>();


        for (String genre : gSet) {
            List<Integer> viewList = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if(genre.equals(genres[i])){
                    viewList.add(plays[i]);
                }
            }
            hm.put(genre, viewList);
            if(hm.get(genre).size() > 1){
                hm.get(genre).sort((o1, o2) -> {
                    return o2 - o1;
                });
            }
        }

        //해쉬 내림차순
        List<String> keySetList = new ArrayList<>(hm.keySet());
        System.out.println(keySetList.size());
        Collections.sort(keySetList, (o1, o2) -> {
            int sum1 = hm.get(o1).stream().mapToInt(a -> a).sum();
            int sum2 = hm.get(o2).stream().mapToInt(a -> a).sum();
            return sum2 - sum1;
        });
        System.out.println(keySetList);
        System.out.println(hm.get(keySetList.get(0)));
        int idx = 0;

        int[] temp = new int[gSet.size() * 2];

        if(keySetList.size() > 2){
            for (String i : keySetList) {
//            System.out.println(hm.get(i));
                int r = 0;
                if(hm.get(i).size() > 1){
//                System.out.println("2222");
                    temp[idx++] = find(plays, hm.get(i).get(0));
                    temp[idx++] = find(plays, hm.get(i).get(1));
                }else {
//                System.out.println("11111");
                    temp[idx++] = find(plays, hm.get(i).get(0));
                }
            }
        }else {
            temp[idx++] = find(plays, hm.get(keySetList.get(0)).get(0));
            temp[idx++] = find(plays, hm.get(keySetList.get(0)).get(1));
        }
//        System.out.println("idx : " + idx);
        answer = new int[idx];
        System.arraycopy(temp, 0, answer, 0, idx);
//        System.out.println(answer.length);
        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
//        String[] genres = {"a", "b", "a", "b", "c"};
//        int[] plays = {100, 200, 300, 400, 500};
//        String[] genres = {"a", "a", "a"};
//        int[] plays = {3, 1, 2};
        int[] test = null;
        BestAlbum ba = new BestAlbum();

        test = ba.solution(genres, plays);
        for (int i : test) {
            System.out.println(i);
        }
    }
}
