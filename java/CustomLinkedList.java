class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value) {
        this(value, null);
    }
}

class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
    }

    public void traverse() {
        Node currentNode = head;

        while (currentNode != null) {
            printNode(currentNode);
            currentNode = currentNode.next;
        }
    }

    void printNode(Node node) {
        System.out.println("Valor: " + node.value + " | Next: " + (node.next != null ? node.next.value : "null"));
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);

        list.traverse();
    }

}
