public class problem_02 {
    public static void main(String[] args){
        int number[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;

        for(int j = 0; j < number[0].length; j++){
            sum += number[1][j];
        }
        System.out.println("sum of 2nd row is:" + sum);
    }
}
