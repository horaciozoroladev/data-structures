class Node {
    constructor(value, next = null) {
        this.value = value
        this.next = next
    }
}

class LinkedList {
    constructor() {
        this.head = null
        this.tail = null
    }

    append(value) {
        const newNode = new Node(value)

        if (!this.head) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }

        this.tail = newNode;
    }


    traverse(callback) {
        let currentNode= this.head;

        while(currentNode != null) {
            callback(currentNode);
            currentNode = currentNode.next;
        }
    }
}

const printNode = (node) => console.log(`Valor: ${node.value} | Next: ${node.next.value}`)

// const list = new LinkedList();

// list.append(1)
// list.append(2)
// list.append(3)

// list.traverse(printNode)