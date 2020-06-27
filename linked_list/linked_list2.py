class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next

class NodeMgmt:
    def __init__(self, data):
        self.head = Node(data)

    def add(self, data):
        if self.head == '':
            self.head = Node(data)
        else:
            node = self.head
            while node.next:
                node = node.next
            node.next = Node(data)

    def desc(self):
        node = self.head
        while node:
            print(node.data)
            node = node.next
    
    # 1. head 삭제
    # 2. 마지막 노드 삭제
    # 3. 중간 노드 삭제

    def delete(self, data):
        if self.head == '':
            print('no data to delete')
            return
        if self.head.data == data:
            ## delete head
            temp = self.head
            self.head = self.head.next
            del temp
        else:
            node = self.head
            while node.next:
                if node.next.data == data:
                    temp = node.next
                    node.next = node.next.next
                    del temp


linkedList = NodeMgmt(0)

for data in range(1, 10):
    linkedList.add(data)

linkedList.desc()