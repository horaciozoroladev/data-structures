class Node:
    def __init__(self, value, next_node=None):
        self.value = value
        self.next = next_node


class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def append(self, value):
        new_node = Node(value)

        if not self.head:
            self.head = new_node
        else:
            self.tail.next = new_node

        self.tail = new_node

    def traverse(self, callback):
        current_node = self.head

        while current_node is not None:
            callback(current_node)
            current_node = current_node.next


def print_node(node):
    print(f"Valor: {node.value} | Next: {node.next.value if node.next else 'None'}")


# Example usage:
linked_list = LinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)

linked_list.traverse(print_node)
