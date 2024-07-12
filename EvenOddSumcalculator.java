import java.util.*;
public class EvenOddSumcalculator {
    public static <T extends Number> void calculateNumberSum(List <T> numbers){
        double evenSum=0;
        double oddSum=0;

        for(T number: numbers){
            if(number.doubleValue() %2 == 0){
                evenSum+=number.doubleValue();
            }else{
                oddSum+=number.doubleValue();
            }
        }
        System.out.println("\nOriginal list of numbers : "+numbers);
        System.out.println("Sum of even number : "+evenSum);
        System.out.println("Sum of all odd numbers : "+oddSum);
    }
    public static void main(String[] args) {
        List <Integer> i = List.of(1,2,3,4,5,6,7,8,9);
        List <Double> d=List.of(2.0,3.0,5.0,6.0,8.0,9.0);
        calculateNumberSum(i);
        calculateNumberSum(d);
    }
    
}
