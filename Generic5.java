

public class Generic5 {
    public static void main(String[] args){
    Box<Integer> i=new Box<Integer>();
    Box<String> s=new Box<String>();
    i.add(10);
    s.add(new String("Subhadeep"));
    System.out.println(i.getadd());
    System.out.println(s.getadd());
    
}
}
class Box<T>{
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T getadd(){
        return t;
    }
}
