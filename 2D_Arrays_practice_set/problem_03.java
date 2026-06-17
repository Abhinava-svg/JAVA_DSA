public class problem_03 {
    public static void main(String[] args){
        int matrix[][] = {{2,5,6},{4,6,8}};
        int row = 2; 
        int col = 3;

        printMatrix(matrix);

        int transpose[][] = new int [col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        System.out.println("The matrix is:");
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
