import java.util.Arrays;
import java.util.Collections;

public class Sorting_04 {
    public static void Insertionsort(int arr[]){
        for(int i = 1; i< arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertions
            arr[prev+1] = curr;
        }
    }

    public static int compare(int a, int b){
        // a < b --> -ve
        // a == b --> 0
        // a > b --> +ve
        return b-a;
    }

    public static void PrintArr(Integer[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    Integer arr[] = {5, 4, 1, 3, 2};
    // Insertionsort(arr); 
    // Sorting first 3 elements in descending order
    Arrays.sort(arr, 0 , 3, Collections.reverseOrder());
    PrintArr(arr);
    }
}
