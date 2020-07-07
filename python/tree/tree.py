class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class NodeMgmt:
    def __init__(self, head):
        self.head = head
    
    def insert(self, value):
        self.current_node = self.head
        while True:
            if value < self.current_node.value:
                if self.current_node.left != None:
                    self.current_node = self.current_node.left
                else:
                    self.current_node.left = Node(value)
                    break
            else:
                if self.current_node.right != None:
                    self.current_node = self.current_node.right
                else:
                    self.current_node.right = Node(value)
                    break
    
    def search(self, value):
        self.current_node = self.head
        while self.current_node:
            if self.current_node:
                if self.current_node.value == value:
                    return True
                elif value < self.current_node.value:
                    self.current_node = self.current_node.left
                else:
                    self.current_node = self.current_node.right
        return False

    def delete(self, value):
        searched = False # 해당 노드를 찾았는지 못 찾았는지
        self.current_node = self.head
        self.parent = self.head
        while self.current_node:
            if self.current_node.value == value:
                searched = True
                break
            elif value < self.current_node.value:
                self.current_node = self.current_node.left
            else:
                self.parent = self.current_node
                self.current_node = self.current_node.right
        if searched == False:
            return False
        ### 이후부터 Case
        # self.current_node 가 삭제할 Node.self.parent의 Parent Node인상태
        # 1. Leaf Node 삭제(삭제할 노드의 자식 노드가 없을때.)
        if self.current_node.left == None and self.current_node.right == None:
            if value < self.parent.value:
                self.parent.left = None
            else:
                self.parent.right = None
            del self.current_node
        # 2. 삭제할 Node가 child Node 한개를 갖고 있을 때.
        #       그 child Node가 왼쪽에 있을 때.
        if self.current_node.left != None and self.current_node.right == None:
            if value < self.parent.value:
                self.parent.left = self.current_node.left
            else:
                self.parent.right = self.current_node.left
        #       그 child Node가 오른쪽에 있을 때.
        elif self.current_node.left == None and self.current_node.right != None:
            if value < self.parent.value:
                self.parent.left = self.current_node.left
            else:
                self.parent.right = self.current_node.right
head = Node(1)
BST = NodeMgmt(head)
BST.insert(2)
BST.insert(0)
BST.insert(4)
BST.insert(8)

print(BST.search(9))