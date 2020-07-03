# 알고리즘 복잡도 계산이 필요한 이유

'''
1. 알고리즘 복잡도 계산이 필요한 이유

하나의 문제를 푸는 알고리즘은 다양할 수 있다.
    | 다양한 알고리즘 어느 알고리즘이 더 좋은지를 분석하기 위해, 복잡도를 정의하고 계산함.

2. 알고리즘 복잡도 계산 항목
    a. 시간 복잡도 : 알고리즘 실행 속도
    b. 공간 복잡도 : 알고리즘이 사용하는 메모리 사이즈
        : 가장 중요한 시간 복잡도를 꼭 이해하고 계산할 수 있어야 함.
'''

## 알고리즘 시간 복잡도의 주요 요소
##  : 반복문이 지배한다.

## 입력의 크기가 커지면 커질수록 반목문이 알고리즘 수행 시간을 지배함.

'''
알고리즘 성능 표기법
    -Big O
        : 알고리즘 최악의 실행 시간을 표기
        : 가장 많이/일반적으로 사용함.
        : 아무리 최악의 상황이라도, 이정도의 성능은 보장한다는 의미로 쓰임
    -오메가
        : 오메가 표기법은 알고리즘 최상의 실행 시간을 표기
    -세타 표기법
        : 오메가 표기법은 알고리즘 평균 실행 시간을 표기

    | 시간 복잡도 계산은 반복문이 핵심 요소임을 인지하고, 계산 표기는 최상, 평균, 최악 중, 최악의 시간인 Big-O 표기법을 중심으로 익히면 됨.
'''

##- 무조건 2회(상수회) 실행한다: O(1) 
##       ```python
n=1

if n > 10:
    print(n)
##       ```
##    - n에 따라, n번, n + 10 번, 또는 3n + 10 번등 실행한다: O(n)
    #    ```python
variable = 1
for num in range(3):
    for index in range(n):
        print(index)
    #    ```
    # - n에 따라, $n^2$번, $n^2$ + 1000 번, 100$n^2$ - 100, 또는 300$n^2$ + 1번등 실행한다: O($n^2$)
    #    ```python
variable = 1
for i in range(300):
    for num in range(n):
        for index in range(n):
                print(index)




## 알고리즘1 : 1부터 n까지의 합을 구하는 알고리즘 1

def sum_all(n):
    total = 0
    for num in range(1, n + 1):
        total += num
    return total

print(sum_all(100))

## 알고리즘2 : 1부터 n까지의 합을 구하는 알고리즘 2

def sum_all2(n):
    return int(n * (n + 1) / 2)
print(sum_all2(100))


### n의 크기가 커질수록 시간복잡도가 증가하는 알고리즘1에 비해 알고리즘2는 n의 수가 무한대로 늘어나도 발생하는 시간복잡도는 일정하다.