// import java.util.*;
// public class Hashmap {
//    public static void main(String[] args) {
//     HashMap<Integer,String>map=new HashMap<Integer,String>();
//     map.put(1,"Mango");
//     map.put(2, "Banana");
//     map.put(3, "Apple");
//     map.put(4, "Coconat");
//     System.out.println("Itration Hashmaping");
//     System.out.println("initial list of element: "+map);
//     map.remove(1);
//     System.out.println("Updated list of element: "+map);
//     map.remove(2);
//     System.out.println("Updated list of element : "+map);
//     map.remove(3,"Apple");
//     System.out.println("Updated list of element: "+map);
//    } 
// }
// /* 
// public class Hashmap {
//     public static void main(String[] args) {
//      HashMap<String,Integer>map=new HashMap<String,Integer>();
//      map.put("Mango",1);
//      map.put("Banana",2);
//      map.put("Apple",3);
//      map.put("Coconat",4);
//      System.out.println("Itration Hashmaping");
//      for(Map.Entry m: map.entrySet()){
//          System.out.println(m.getKey()+" "+m.getValue());
//      }
//     } 
//  }
// */

// import java.util.*;
// class Hashmap{
//     public static void main(String[] args) {
//         TreeSet<Integer>set=new TreeSet<Integer>();
//         set.add(24);
//         set.add(25);
//         set.add(26);
//         set.add(27);
//         System.out.println("Lowest value"+set.pollFirst());
//         System.out.println("Highest value: "+set.pollLast());
//     }
// }

import java.util.*;
public class Hashmap {
   public static void main(String[] args) {
    List<String>list1=new ArrayList<String>();
    list1.add("Mango");
    list1.add("Apple");
    list1.add("Banana");
    list1.add("Graps");
    Collection.sort(list1);
    for(String fruit: list1){
        System.out.println(fruit);
    }

    System.out.println("sorting numbers");
    List<Integer>list2=new ArrayList<Integer>();
    list2.add(21);
    list2.add(11);
    list2.add(11);
    list2.add(51);
    list2.add(1);
    Collection.sort(list2);
    for(Integer number: list2){
        System.out.println(list2);
    }

   } 
}