## Linked List 구조
"""
 - 연결 리스트라고도 함
 - 배열은 순차적으로 연결된 공간에 데이터를 나열하는 구조
 - 링크드 리스트는 떨어진 곳에 존재하는 데이터를 화살표로 연결해서 관리하는 데이터 구조
 - 본래 C언어에서는 주요한 데이터 구조이지만, 파이썬은 리스트 타입이 링크드 리스트의 기능을 모두 지원
"""

## 간단한 링크드 리스트 예

"""
 Node 구현
 - 보통 파이썬에서 링크드 리스트 구현시, 파이썬 클래스를 활용한다.
   : 파이썬 객체지향 문법 이해 필요
   : 참고 : https://www.fun-coding.org/PL&OOP1-3.html
"""

# class Node:
#     def __init__(self, data):
#         self.data = data
#         self.next = None


## Node 객체
class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
## Node와 Node 연결하기 (포인터 활용)
node2 = Node(2)
#node1.next = node2
# 가장 앞에 있는 node 값을 알 수 있는 변수 선언.

## 링크드 리스트로 데이터 추가하기
def add(data):
    node = head
    # node.next 가 None이 아니라면, 현재 node의 주소를 node.next로 이동.
    while node.next:
        node = node.next
    node.next = Node(data)

## Node 인스턴스 생성
node1 = Node(1)
head = node1
node = head

for index in range(3, 11):
    add(index)

# while node.next:
#     print(node.data)
#     node = node.next
# print (node.data)

'''
링크드 리스트의 장단점 (전통적인 C언어에서의 배열과 링크드 리스트)
    - 장점
        1. 미리 데이터 공간을 할당하지 않아도 됨. : 배열은 미리 데이터 공간을 할당해야 한다.
    - 단점
        1. 연결을 위한 별도 데이터 공간이 필요하므로, 저장공간 효율이 높지 않다.
        2. 연결 정보를 찾는 시간이 필요하므로 접근 속도가 느림
        3. 중간 데이터 삭제시, 앞뒤 데이터의 견결을 재구성해야 하는 부가적인 작업 필요    
'''

## 링크드 리스트의 복잡한 기능 1(링크드 리스트 데이터 사이에 데이터를 추가)
    ## 링크드 리스트는 유지 관리에 부가적인 구현이 필요함.

node3 = Node(1.5)
node = head
search = True

while search:
    if node.data == 1:
        search = False
    else:
        node = node.next

node_next = node.next
node.next = node3
node3.next = node_next

while node.next:
    print(node.data)
    node = node.next
print (node.data)