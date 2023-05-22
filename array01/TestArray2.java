public class TestArray2 {

    public static void main(String[] args){

        int[][] array = {{1,2,3},{4,5,6},{1,2,3}};

        for( int i =0; i<3;i++){
            for ( int j =0; j< 3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
