import java.util.*;

public class Array_06 {
    public static void printparirs(int numbers[]){
        int tp = 0;
        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[i] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};
        printparirs(numbers);
    }
}
