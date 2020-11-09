# 탐욕 알고리즘의 이해
1. 탐욕 알고리즘 이란?
- Greedy algorithm 또는 탐욕 알고리즘 이라고 불리움
- 최적의 해에 가까운 값을 구하기 위해 사용됨
- 여러 경우 중 하나를 결정해야할 때마다, **매순간 최적이라고 생각되는 경우**를 선택하는 방식으로 진행해서, 최종적인 값을 구하는 방식

### 문제1 : 동전문제
- 지불해야 하는 값이 4720원 일 때, 1원, 50원, 100원, 500원 동전으로 동전의 수가 가장 적게 지불하시오
    - 가장 큰 돈전부터 최대한 지불해야 하는 값을 채우는 방식으로 구현 가능
    - 탐욕 알고리즘으로 매순간 최적이라고 생각하는 경우를 선택하면 됨.

```python
# input
coin_list = [1, 100, 50, 500]

def min_coin_count(value, coin_lit):
    totalCoinCount = 0
    details = list()
    coin_list.sort(reverse=True)
    for coin in coin_list:
        coinNum = value // coin
        totalCoinCount += coinNum
        value -= coinNum * coin
        details.append([coin, coinNum])
    return totalCoinCount, details

# output
print(min_coin_count(4720, coin_list))

(31, [[500, 9], [100, 2], [50, 0], [1, 20]])
```

### 문제2 : 부분 배낭 문제
- 무게 제한이 k인 배낭에 최대 가치를 가지도록 물건을 넣는 문제
    - 각 물건은 무게(w)와 가치(v)로 표현될 수 있음
    - 물건은 쪼갤 수 있으므로 물건의 일부분이 배낭에 넣어질 수 있음, 그래서 Fractional Knapsack Problem 으로 부름
        - Fractional Knapsack Problem 의 반대로 물건을 쪼개서 넣을 수 없는 배낭 문제도 존재함 (0/1 Knapsack Problem 으로 부름)

# 탐욕 알고리즘의 한계
- 탐욕 알고리즘은 근사치 추정에 활용
- 반드시 최적의 해를 구할 수 있는 것은 아니기 때문
- 최적의 해에 가까운 값을 구하는 방법 중의 하나임.