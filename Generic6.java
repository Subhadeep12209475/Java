import java.util.*;
public class Generic6 {
    public static void printAll(List<?> list){
        for (Object item : list)
        System.out.println(item+" ");
    }
    public static void main(String[] args) {
        List<Integer> integerlist=Arrays.asList(1,2,3);
        printAll(integerlist);
        List<Double> doubleList = Arrays.asList(1.2,2.3,4.5);
        printAll(doubleList);
    }
}
