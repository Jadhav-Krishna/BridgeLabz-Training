package collections.QueueInterface;

import java.util.*;

public class CircularBuffer {

    private Deque<Integer> queue;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.queue = new ArrayDeque<>();
    }

    // Add element
    public void enqueue(int data) {
        if (queue.size() == capacity) {
            queue.pollFirst();   
        }
        queue.offerLast(data);   
    }

    // Remove element
    public int dequeue() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Buffer is empty");
        }
        return queue.pollFirst();
    }

    // Peek front
    public int peek() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Buffer is empty");
        }
        return queue.peekFirst();
    }

    public void printBuffer() {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.enqueue(10);
        cb.enqueue(20);
        cb.enqueue(30);
        cb.printBuffer();   

        cb.enqueue(40);     
        cb.printBuffer();   

        cb.enqueue(50);     
        cb.printBuffer();   
    }
}
