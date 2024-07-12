class genericClass<X>{
    <T> genericClass(T t){
        System.out.println(t);
    }
}
public class Generic3 {
    public static void main(String[] args) {
        genericClass<String> g= new genericClass<>("Helllo");
    }
}
