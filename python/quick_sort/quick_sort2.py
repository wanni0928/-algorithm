import random

def qsort(data):
    if len(data) <= 1:
        return data
    left, right = list(), list()
    pivot = data[0]

    left = [item for item in data[1:] if pivot > item]
    right = [item for item in data[1:] if pivot <= item]

    return qsort(left) + [pivot] + qsort(right)

data_list = random.sample(range(100), 10)
print(data_list)
print(qsort(data_list))