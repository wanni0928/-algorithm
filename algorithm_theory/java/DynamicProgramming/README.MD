# Dynamic Programming
## 정의
- 동적 계획법
    - 입력 크기가 작은 부분 문제들을 해결한 후, 해당 부분 문제의 해를 활용해서, 보다 큰 크기의 부분 문제를 해결, 최종적으로 전체 문제를 해결하는 알고리즘
    - 상향식 접근법으로, 가장 최하위 해답을 구한 후, 이를 저장하고, 해당 결과값을 이용해서 상위 문제를 풀어가는 방식
    - Memoization 기법을 사용함
        - Memoization : 프로그램 실행 시 이전에 계산한 값을 저장하여, 다시 계산하지 않도록 하여 전체 실행 속도를 빠르게 하는 기술
    - 문제를 잘게 쪼겔 때, 부분 문제는 중복되어, 재활용됨.
        - 예: 파보나치 수열 [소스코드](https://github.com/wanni0928/-algorithm/blob/master/algorithm_theory/java/DynamicProgramming/Fibonachi.java)
        
    ![피보나치 수열](https://github.com/wanni0928/-algorithm/blob/master/algorithm_theory/java/DynamicProgramming/imgs/Fibonacci.png)


    ![동적 계획법](https://github.com/wanni0928/-algorithm/blob/master/algorithm_theory/java/DynamicProgramming/imgs/dp.png)