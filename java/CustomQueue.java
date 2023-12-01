import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {

    private Queue<Integer> items;

    public CustomQueue() {
        this.items = new LinkedList<>();
    }

    public void enqueue(int item) {
        this.items.add(item);
    }

    public int dequeue() {
        return this.items.poll();
    }

    public int peek() {
        return this.items.peek();
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        queue.enqueue(0);
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);

        System.out.println(queue.peek());
    }
}
