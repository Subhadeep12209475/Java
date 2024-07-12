import java.util.*;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijai");
        list.add("Subha");
        list.add("Ravi");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
