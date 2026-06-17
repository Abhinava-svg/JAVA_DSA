public class problem_01{
    public static void main(String[] args) {
  
        int primeof7 = 0;
        int array[][] = {{4,7,8},{8,8,7}};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == 7){
                    primeof7++;
                }
            }
        }
       
        System.out.println("prime of 7 is:" + primeof7);
    }
        
}
