package P_C_89_95.collection_practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(55);
        queue.offer(255);

        Utility.print(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        Utility.print(queue);
        System.out.println(queue.poll());

        Utility.print(queue);
        System.out.println(queue.poll());

        
    }
}
