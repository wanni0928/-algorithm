'''
데이터가 2개일 때,
[5, 2]

데이터가 3개일 때,
[5, 4, 2]

데이터가 4개일 때,
[5, 2, 3, 1]

'''
import random

data_list = random.sample(range(100), 50)

def bubbleSort(data):
    for index in range(len(data)-1):
        swap = False
        for index2 in range(len(data) - index - 1):
            if data[index2] > data[index2 + 1]:
                data[index2], data[index2 + 1] = data[index2 + 1], data[index2]
                swap = True
        
        if swap == False:
            break;
    return data

print(bubbleSort(data_list))

'''
시간 복잡도.

- 반복문이 2개 : O(n^2)
- 최악의 경우 : n * (n - 1) / 2
- 완전 정렬이 되어있는 상태에서 최선은 O(n)
'''