package com.programmers.algorithm;

import java.util.*;
import java.util.stream.Stream;

public class StockPrice {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        LinkedList<Integer> stockPrices = new LinkedList<>();
        for (int price : prices) {
            stockPrices.add(price);
        }

        int idx = 0;
        int sample = 0;
        while (stockPrices.size() != 0){
            sample = stockPrices.poll();
            int stockIdx = 0;
            for (int stock : stockPrices) {
                if(sample > stock){
                    answer[idx] = stockPrices.indexOf(stock) + 1;
                    break;
                }
                stockIdx++;
            }
            if(stockIdx == stockPrices.size()){
                answer[idx] = stockIdx;
            }
            idx++;
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] prices = {1, 2, 3, 2, 3};
        int[] prices = {1, 2, 3, 2, 3, 3, 1};
        System.out.println(Arrays.toString(new StockPrice().solution(prices)));
    }
}
