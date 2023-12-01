class CustomQueue:
    def __init__(self):
        self.items = []
    
    def enqueue(self, item):
        self.items.append(item) # type: ignore
    
    def dequeue(self):
        return self.items.pop(0) if self.items else None

    def peek(self):
        return self.items[0] if self.items else None

queue = CustomQueue()

queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)

print(queue.peek())