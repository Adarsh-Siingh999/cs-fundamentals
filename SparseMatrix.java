public class SparseMatrix {
    public static void main(String[] args) {
        int rows = 4 , columns = 5;
        int matrix[][] = {
             {0, 0, 3, 0, 4},
             {0, 0, 5, 7, 0},
             {0, 0, 0, 0, 0},
             {0, 2, 6, 0, 0}
     
        };

        System.out.printf("%-8s %-8s %-8s\n" , "Rows" , "Columns" , "Value");
      
        System.out.println("--------------------------");
        System.out.println();
        for ( int i = 0 ; i < rows ; i++ ){
            for ( int j = 0 ; j < columns ; j++ ){
                if (matrix[i][j] != 0){
                    System.out.printf("%-10d %-10d %-10d\n", i , j , matrix[i][j]);                
                } 
            }
        }
    }
}
