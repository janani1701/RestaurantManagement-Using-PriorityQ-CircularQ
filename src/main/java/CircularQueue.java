import java.util.LinkedList;
import java.util.Queue;

class CircularQueue {
    private Queue<Order> queue;
    private int size;

    public CircularQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.size = capacity;
    }

    public boolean isFull() {
        return queue.size() == size;
    }

    public void enqueue(Order order) {
        if (!isFull()) {
            queue.offer(order);
        } else {
            System.out.println("Queue is full. Cannot add order.");
        }
    }

    public Order dequeue() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
