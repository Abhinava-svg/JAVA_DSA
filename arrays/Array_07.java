import java.util.*;
// print subarrays

public class Array_07 {
    public static void printsubarrays(int numbers[]){
        int ts = 0;
        int totalsum = 0;

        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k = start; k <= end; k++){//print
                    System.out.print(numbers[k] + "");//subarrays
                    sum += numbers[k];
                }
                System.out.println(" = " + sum);
                totalsum += sum;
                ts++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs: " + ts);
        System.out.println("sum of all subarrays: " + totalsum);
    }
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};
        printsubarrays(numbers);
    }
}
