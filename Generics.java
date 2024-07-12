public class Generics {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+"="+element);
    }
    public static void main(String[] args) {
        genericDisplay(11);
        genericDisplay("LPU");
        genericDisplay(11.0);

    }
    
}
