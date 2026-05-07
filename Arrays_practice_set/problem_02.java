public class problem_02 {
    public static int BinarySearch(int[] numbers, int target){
        int start = 0, end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(numbers[mid] == target){
                return mid;
            }

            // checks if left half is sorted
            if(numbers[start] <= numbers[mid]){

                if(target >= numbers[start] && target < numbers[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }

            // otherwise right half is sorted
            else{

                if(target > numbers[mid] && target <= numbers[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        System.out.println("target matches in the input : " + BinarySearch(numbers, target));
    }
}
