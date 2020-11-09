# ### 문제2 : 부분 배낭 문제
# - 무게 제한이 k인 배낭에 최대 가치를 가지도록 물건을 넣는 문제
#   - 각 물건은 무게(w)와 가치(v)로 표현될 수 있음
#   - 물건은 쪼갤 수 있으므로 물건의 일부분이 배낭에 넣어질 수 있음, 그래서 Fractional Knapsack Problem 으로 부름
#     - Fractional Knapsack Problem 의 반대로 물건을 쪼개서 넣을 수 없는 배낭 문제도 존재함 (0/1 Knapsack Problem 으로 부름)

dataList = [(10, 10), (15, 12), (20, 10), (25, 8), (30, 5)]


def getMaxValue(dataList, capacity):
    dataList = sorted(dataList, key=lambda x:x[1]/x[0], reverse=True)
    totalValue = 0
    details = list()

    for data in data_list:
        if capacity - data[0] >= 0:
            capacity -= data[0] 
            totalValue += data[1]
            details.append([data[0], data[1], 1])
        else:
            fraction = capacity / data[0]
            capacity -= data[0] * fraction
            totalValue += data[1] * fraction
            details.append([data[0], data[1], fraction])
    return totalValue, details