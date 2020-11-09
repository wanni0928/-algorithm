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

print(graph)

{
    'A': ['B', 'C'],
    'B': ['A', 'D'], 
    'C': ['A', 'G', 'H', 'I'], 
    'D': ['B', 'E', 'F'], 
    'E': ['D'], 
    'F': ['D'], 
    'G': ['C'], 
    'H': ['C'], 
    'I': ['C', 'J'], 
    'J': ['I']
}

