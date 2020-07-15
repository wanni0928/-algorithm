import random

data_list = random.sample(range(100), 50)

def insertion_sort(data):
    for index in range(len(data) - 1):
        for index2 in range(index + 1, 0, -1):
            if data[index2] < data[index2 - 1]:
                data[index2], data[index2 - 1] = data[index2 - 1], data[index2]
            else:
                break
    return data

print(insertion_sort(data_list))

'''
시간 복잡도.

- 반복문이 2개 : O(n^2)
- 최악의 경우 : n * (n - 1) / 2
- 완전 정렬이 되어있는 상태에서 최선은 O(n)
'''