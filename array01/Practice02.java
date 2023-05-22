public class Practice02 {

    static void min( int array[]) {

        int min = array[0];

        for ( int j : array) {
            if( min > j){

                min = j;

            }
            
        }
        System.out.println("min:"+min);

    }

    public static void main(String[] args) {

        int array[] = new int[4];
        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;

        for ( int i : array){
            System.out.println(i +" ");
        }

        int array1[] = {11, 22, 33, 44};

        for( int i : array1) {
            System.out.print(i+ " ");
        }

        min(array1);
        
    }
    
}
