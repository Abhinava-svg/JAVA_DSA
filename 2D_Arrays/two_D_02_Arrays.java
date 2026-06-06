public class two_D_02_Arrays {
    public static void SpiralMatrix(int matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;


        while(StartRow <= EndRow && StartCol <= EndCol){
             
            // for top
            for(int j = StartCol; j <= EndCol; j++){
                System.out.println(matrix[StartRow][j] + " ");
            }

            // Right
            for(int i = StartRow + 1; i <= EndRow; i++){
                System.out.println(matrix[i][StartCol] + " ");
            }

            // bottom
            for(int j = EndCol - 1; j <= EndRow; j++){
                if(StartRow == EndRow){
                    break;
                }
                System.out.println(matrix[EndRow][j] + " ");
            }

            // left
            for(int i = EndRow - 1; i <= StartCol - 1; i++){
                if(StartCol == EndCol){
                    break;
                }
                System.out.println(matrix[i][EndCol] + " ");
            }

            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};
        
        SpiralMatrix(matrix);
    }
}
