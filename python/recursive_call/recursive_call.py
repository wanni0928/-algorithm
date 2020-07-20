def factorial(num):
    if num > 1:
        return num * factorial(num - 1)
    else:
        return num

for num in range(10):
    print(factorial(num))

'''
시간 복잡도

재귀함수는 n-1번 반복문을 호출한 것과 동일
O(n-1)
'''