import java.util.*;
public class Array_list1 {
    public static void main(String[] args) {
        TreeSet<String>set=new TreeSet<String>();
        set.add("Vijai");
        set.add("Subha");
        set.add("Ravi");
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
