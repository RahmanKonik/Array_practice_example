package Array_practice_example;

public class ArrayTwoDemo {

    public static void main(String[] args) {

        int[][] array2D = new int[3][4];

        for( int i = 0; i < 3;i++){
           for ( int j = 0 ; j < 4; j++){
            array2D[i][j] = i * 4 + j;
           }
        }

        for( int i = 0; i < 3;i++){
            for ( int j = 0 ; j < 4; j++){
             System.out.print(array2D[i][j] + " ");
            }

            System.out.println();
         }
        
    }
    

}
