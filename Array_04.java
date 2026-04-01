import java.util.*;

public class Array_04 {
    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            // Compraisons
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println("index for key is:" + BinarySearch(numbers, key));
    }
}
