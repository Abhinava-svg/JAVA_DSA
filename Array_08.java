import java.util.*;

public class Array_08 {
    public static void maxsubarrays(int numbers[]){
        int currsum = 0;
        int Maxsum = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currsum = 0;
                for(int k = start; k <= end; k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(Maxsum < currsum){
                    Maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum = " + Maxsum);
    }
    public static void main(String[] args){
        int numbers[] = {1, -1, 2, -3, 4};
        maxsubarrays(numbers);
    }
}
