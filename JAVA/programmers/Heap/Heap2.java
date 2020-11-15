package com.programmers.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Heap2 {
    List<Integer> heap;

    public Heap2() {
        this.heap = new ArrayList<>();
        this.heap.add(null);
    }

    public boolean insert(int data){
        if(this.heap.size() == 0){
            this.heap.add(null);
            this.heap.add(data);
            return true;
        }

        this.heap.add(data);

        int insertedIdx = this.heap.size() - 1;
        int parentIdx = insertedIdx / 2;
        int temp;
        while(moveUp(insertedIdx)){
            temp = this.heap.get(insertedIdx);
            this.heap.set(insertedIdx, this.heap.get(parentIdx));
            this.heap.set(parentIdx, temp);
            insertedIdx = parentIdx;
        }
        return true;
    }

    public int pop(){
        if (this.heap.size() <= 1) return -1;
        int returnedData = this.heap.get(1);
        this.heap.set(1, this.heap.get(this.heap.size() - 1));
        this.heap.remove(this.heap.size() - 1);
        int popedIdx = 1;
        int leftChildIdx = popedIdx * 2;
        int rightChildIdx = popedIdx * 2 + 1;
        int temp;

        while (moveDown(popedIdx)){
            // 오른쪽 자식 노드만 없을 때
            if(rightChildIdx >= heap.size()){
                if(this.heap.get(popedIdx) < this.heap.get(leftChildIdx)){
                    temp = this.heap.get(popedIdx);
                    this.heap.set(popedIdx, leftChildIdx);
                    this.heap.set(leftChildIdx, temp);
                    popedIdx = leftChildIdx;
                }
            }else {
                // 왼쪽, 오른쪽 자식 노드 모두 있을 때.
                if (this.heap.get(leftChildIdx) > this.heap.get(rightChildIdx)) {
                    if(this.heap.get(popedIdx) < this.heap.get(leftChildIdx)){
                        temp = this.heap.get(popedIdx);
                        this.heap.set(popedIdx, leftChildIdx);
                        this.heap.set(leftChildIdx, temp);
                    }
                }else {
                    if(this.heap.get(popedIdx) < this.heap.get(rightChildIdx)){
                        temp = this.heap.get(popedIdx);
                        this.heap.set(popedIdx, rightChildIdx);
                        this.heap.set(rightChildIdx, temp);
                    }
                }
            }
        }
        return returnedData;
    }

    private boolean moveDown(int popedIdx) {
        int leftChildIdx = popedIdx * 2;
        int rightChildIdx = popedIdx * 2 + 1;

        // 왼쪽 자식 노드도 없을 때
        if(leftChildIdx >= heap.size()){
            return false;
        }else if(rightChildIdx >= this.heap.size()){
            // 오른쪽 자식 노드만 없을 때
            if(this.heap.get(popedIdx) >= this.heap.size()){
                if(this.heap.get(popedIdx) < this.heap.get(leftChildIdx)){
                    return true;
                }else {
                    return false;
                }
            }
        }else {
            // 왼쪽, 오른쪽 자식 노드 모두 있을 때
            if(this.heap.get(leftChildIdx) > this.heap.get(rightChildIdx)){
                if (this.heap.get(popedIdx) < this.heap.get(rightChildIdx)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }

    private boolean moveUp(int insertedIdx) {
        if(insertedIdx <= 1) return false;

        int parentIdx = insertedIdx / 2;
        if(this.heap.get(insertedIdx) > this.heap.get(parentIdx)){
            return true;
        }else {
            return false;
        }
    }
}
