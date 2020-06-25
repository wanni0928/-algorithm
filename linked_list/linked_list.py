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

while node.next:
    print(node.data)
    node = node.next
print (node.data)