package com.programmers.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Heap {
    List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<Integer>();
        heap.add(0);
    }

    public void insert(int n) {
        heap.add(n);
        int p = heap.size() - 1;
        while (p < 1 || heap.get(p / 2) > heap.get(p)) {
            // 부모노드와 자식 노드의 값 교환
            int tmp = heap.get(p / 2);
            heap.set(p / 2, heap.get(p));
            heap.set(p, tmp);
            p = p / 2;
        }
    }

    public int delete() {
        if (heap.size() <= 1)
            return 0;
        int deleteItem = heap.get(1); // 삭제할 노드 = 루트노드

        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int pos = 1;
        while ((pos * 2) < heap.size()) {
            int min = heap.get(pos * 2);
            int minPos = pos * 2;

            if (((pos * 2 + 1) < heap.size()) && min > heap.get(pos * 2 + 1)) {
                min = heap.get(pos * 2 + 1);
                minPos = pos * 2 + 1;
            }
            if (heap.get(pos) < min)
                break;
            // 부모노드 자식노드 교환
            int tmp = heap.get(pos);
            heap.set(pos, heap.get(minPos));
            heap.set(minPos, tmp);
            pos = minPos;
        }

        return deleteItem;
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}

class HeapDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Heap heap = new Heap();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            if (data == 0) System.out.println(heap.delete());
            else heap.insert(data);
        }
        System.out.println(heap.toString());
    }
}

