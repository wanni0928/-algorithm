def multiple(num):
    if num <= 1:
        return num
    return num * multiple(num - 1)

print(multiple(10))