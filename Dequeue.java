import java.util.*;
//import java.util.ArrayList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<String>dequeue=new ArrayDeque<String>();
        dequeue.add("Ravi");
        dequeue.add("Vijai");
        dequeue.add("Subha");
        dequeue.add("Ravi");
        for(String str:dequeue){
            System.out.println(str);
        }

    }
}
