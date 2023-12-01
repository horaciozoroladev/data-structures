class Graph:
    def __init__(self):
        self.nodes = []
        self.adj_list = {}

    def add_node(self, node):
        self.nodes.append(node)
        self.adj_list[node] = []

    def add_edge(self, node1, node2):
        self.adj_list[node1].append(node2)
        self.adj_list[node2].append(node1)


graph = Graph()

graph.add_node('A')
graph.add_node('B')
graph.add_node('C')
graph.add_node('D')
graph.add_node('E')

graph.add_edge('A', 'B')
graph.add_edge('A', 'C')
graph.add_edge('B', 'D')
graph.add_edge('C', 'E')

print(graph.adj_list)
