# BFS 알고리즘 구형
# - 자료구조 큐를 활용함
#     - need_visit 큐, 두 개의 큐를 생성.

# 큐 
data = [1, 2, 3]
data.extend([4, 5])
print(data)

def bfs(graph, start_node):
    visited = list()
    need_visit = list()

    need_visit.append(start_node)

    count = 0
    while need_visit:
        count += 1
        node = need_visit.pop(0)
        if node not in visited:
            visited.append(node)
            need_visit.extend(graph[node])
    print(count)
    return visited

graph = dict()

graph['A'] = ['B', 'C']
graph['B'] = ['A', 'D']
graph['C'] = ['A', 'G', 'H', 'I']
graph['D'] = ['B', 'E', 'F']
graph['E'] = ['D']
graph['F'] = ['D']
graph['G'] = ['C']
graph['H'] = ['C']
graph['I'] = ['C', 'J']
graph['J'] = ['I']

print(bfs(graph, 'A'))

# 시간 복잡도
# V : 노드 수
# E : 간선 수
# O(V + E)
