import random

def selectionSort(data):
    for stand in range(len(data) - 1):
        lowest = stand
        for index in range(stand + 1, len(data)):
            if data[lowest] > data[index]:
                lowest = index
        data[lowest], data[stand] = data[stand], data[lowest]
    return data

data_list = random.sample(range(100), 50)
print(selectionSort(data_list))

'''
시간 복잡도

- 반복문이 두개 O(n^2)
    : 상세하게 계산하면, n * (n - 1) / 2 
'''