class HashTable:
    def __init__(self, size):
        self.buckets = [None] * size
        self.numBuckets = size

    def hash(self, key):
        total = 0

        for char in key:
            total += ord(char)

        return total % self.numBuckets

    def insert(self, key, value):
        index = self.hash(key)

        if self.buckets[index] is None:
            self.buckets[index] = []

        self.buckets[index].append((key, value))

    def get(self, key):
        index = self.hash(key)

        if self.buckets[index] is None:
            return None

        for item in self.buckets[index]:
            if item[0] == key:
                return item[1]

        return None

# Example usage:
hash_table = HashTable(10)
hash_table.insert("name", "John")
hash_table.insert("age", 25)

print(hash_table.get("name"))  # Output: John
print(hash_table.get("age"))   # Output: 25
print(hash_table.get("city"))  # Output: None
