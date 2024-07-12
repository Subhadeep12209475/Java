class Box<T> {
    private T object;
    public void setObject(T object){
        this.object=object;
    }
    public T getObject(){
        return object;
    }
}
public class Generic1 {
    public static void main(String[] args) {
        Box<String> s=new Box<>();
        s.setObject("SUbhadeep");
        String str=s.getObject();
        System.out.println(str);
        Box<Integer> i = new Box<>();
        i.setObject(12);
        int a =i.getObject();
        System.out.println(a);
    }
    
}
