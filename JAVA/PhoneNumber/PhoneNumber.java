package com.company;


import java.util.*;

public class PhoneNumber {
    public boolean checkDuplication(HashMap<String, Integer> hm){
        boolean check = true;
        Iterator hmIterator = hm.entrySet().iterator();
        while (hmIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if((Integer) mapElement.getValue() > 1){
//                System.out.println("key : " + mapElement.getKey() + " value : " + mapElement.getValue());
                check = false;
                break;
            }
        }
        return check;
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, (o1, o2) -> {
            return o1.length() - o2.length();
        });
        HashMap<String, Integer> hm = new HashMap<>();

        String[] sample = null;

        boolean answer = true;

        for (String number : phone_book) {
            hm.put(number, hm.getOrDefault(number, 0) + 1);
        }

        if(!checkDuplication(hm)) {
//            System.out.println(1);
            return answer = false;
        }

        for (String number : phone_book) {
            sample = Arrays.stream(phone_book).filter(num -> num.startsWith(number)).toArray(String[]::new);
            System.out.println("String number : " + number + " smaple length " + sample.length);
            if(sample.length > 1) return answer = false;
        }
//        hm.put(phone_book[0], hm.getOrDefault(phone_book[0], 0) + 1);
//        System.out.println(phone_book[2].substring(0, phone_book[0].length()));
        return answer;
    }

    public static void main(String[] args) {
//        String[] a = {"97674223", "119", "1195524421"};
//        String[] a = {"123", "456", "789"};
        String[] a = {"12", "123", "1235", "567", "88"};
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.solution(a));
    }
}

//class Mycomp implements Comparator<String> {
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }
//}