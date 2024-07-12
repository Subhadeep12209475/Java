import java.util.*;
public class Deque1 {
    public static void main(String[] args) {
        Deque<String>dequeue=new ArrayDeque<String>();
        dequeue.offer("Ravi");
        dequeue.offer("Vijai");
        dequeue.add("Subha");
        dequeue.offerFirst("Ram");
        System.out.println("After offerfirst Traversal");
        for(String s:dequeue){
            System.out.println(s);
        }
        dequeue.pollLast();
        System.out.println("After pollLast() travarsal");
        for(String s:dequeue){
            System.out.println(s);
        }
    }
}
