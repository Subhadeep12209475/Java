import java.io.FileInputStream;

import javax.sound.midi.Soundbank;

// public class Array_1 {
//     public static void main(String[] args) {
//         try{
//         System.out.println("1");
//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("4");
//         System.out.println(20/0);
//         System.out.println("6");
//         System.out.println("7");
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }finally{
//             System.out.println("finally block executed");
//         }
//     }
// }

// public class Array_1 {
//     public static void main(String[] args) {
//         try{
//         System.out.println("1");
//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("4");
//         System.out.println("5");
//         System.out.println("6");
//         System.out.println("7");
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }finally{
//             System.out.println("finally block executed");
//         }
//     }
// }

public class Array_1 {
    public static void main(String[] args) {
        try{

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println(20/0);
        System.out.println("6");
        System.out.println("7");
        try{
            FileInputStream abc=new FileInputStream("s:/xyz.txt");
        }
        catch(Exception e){
            System.out.println("Subvha");
        }
        }catch(Exception e){
            System.out.println("catch 2");
        }
    }
}


// public class Array_1 {
//     public static void main(String[] args) {
//         try{
//         System.out.println("1");
//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("4");
//         System.out.println(20/0);
//         System.out.println("6");
//         System.out.println("7");
//         }
//         finally{
//             System.out.println("finally block executed");
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
