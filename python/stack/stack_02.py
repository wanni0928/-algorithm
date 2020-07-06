#파이썬 리스트 기능에서 제공하는 메서드로 스택 사용해보기
#append(push), pop 메서드 제공

# data_stack = list()

# data_stack.append(1)
# data_stack.append(2)

# print(data_stack)
# print(data_stack.pop())

stack_list = list()

def push(data):
    stack_list.append(data)

def pop():
    data = stack_list[-1]
    del stack_list[-1]
    return data

for index in range(10):
    push(index)

print(pop())