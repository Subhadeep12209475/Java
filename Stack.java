import java.util.*;

public class Stack {
    public static void main(String[] args) {
        Deque<String>deque=new ArrayDeque<String>();
        deque.offer("Ravi");
        deque.offerFirst("Vijai");
        deque.offerFirst("Subha");
        deque.offerFirst("Ram");
        System.out.println("After offerfirst Traversal");
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        System.out.println("After pollLast() travarsal");
        for(String s:deque){
            System.out.println(s);
        }
    }
}
