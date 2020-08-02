package com.company;


import java.util.Arrays;

public class PhoneNumber_recap3 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, (o1, o2) -> {
            return o1.length() - o2.length();
        });
        String[] sample = null;

        boolean answer = true;
        long count = 0;

        for (String number : phone_book) {
//            sample = Arrays.stream(phone_book).filter(num -> num.startsWith(number)).toArray(String[]::new);
            count = Arrays.stream(phone_book).filter(num -> num.startsWith(number)).count();
            System.out.println("String number : " + number + " smaple length " + count);
            if(count > 1) return answer = false;
        }
        
        return answer;
    }

    public static void main(String[] args) {
//        String[] a = {"97674223", "119", "1195524421"};
//        String[] a = {"123", "456", "789"};
        String[] a = {"12", "123", "1235", "567", "88"};
        PhoneNumber_recap3 phoneNumber = new PhoneNumber_recap3();
        System.out.println(phoneNumber.solution(a));
    }
}

//class Mycomp implements Comparator<String> {
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }
//}