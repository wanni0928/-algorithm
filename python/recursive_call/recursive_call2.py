def factorial(num):
    if num <= 1:
        return num
    return_value = num * factorial(num - 1)
    return return_value

for num in range(10):
    print(factorial(num))