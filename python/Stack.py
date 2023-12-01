class Stack:
    def __init__(self):
        self.items = []
    
    def push(self, item):
        self.items.append(item)
    
    def pop(self):
        return self.items.pop() if self.items else None
    
    def peek(self):
        return self.items[-1] if self.items else None
    
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)

print(f"Ultimo Valor: {stack.peek()}")
stack.pop()
print(f"Ultimo Valor: {stack.peek()}")