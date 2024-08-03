import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(5);
        q.offerLast(50);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());

    }
}
