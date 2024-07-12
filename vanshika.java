import java.util.*;
public class vanshika {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        try{
            int b=sc.nextInt();
            if(n>=b){
                for(int i=0;i<n;i++){
                if(i==b){
                    System.out.println(arr[i]);
                }
                
            }
        }else{
            System.out.println("player does not exist");
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
