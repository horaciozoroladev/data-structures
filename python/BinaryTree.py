import json


class BinaryTree:
    def __init__(self, value, left = None, right = None) -> None:
        self.value = value
        self.left = left
        self.right = right

def tree_to_dict(node):
    if node is None:
        return None
    return {
        'value': node.value,
        'left': tree_to_dict(node.left),
        'right': tree_to_dict(node.right)
    }


root = BinaryTree(1)
root.left = BinaryTree(2)
root.right = BinaryTree(2)

tree_dict = tree_to_dict(root)
json_tree = json.dumps(tree_dict, indent=2)

print(json_tree)