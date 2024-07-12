class GenericMethod{
   public <T> void Generic4(T data){
    System.out.println("generic method");
    System.out.println("Data passed : "+data);
   }
}
public class Generic4 {
    public static void main(String[] args) {
        GenericMethod demo=new GenericMethod();
        demo.<String> Generic4("java Programe");
        demo.<Integer>Generic4(25);
    }
    
}
