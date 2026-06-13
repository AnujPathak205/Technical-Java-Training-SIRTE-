package CollectionAPIs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


// First In First Out Data structure:
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println(queue.peek());

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
