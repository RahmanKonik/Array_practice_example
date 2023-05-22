public class TestReturnArray {

    static int[] get () {

        return new int[] {1,2,3,4};
    }

    public static void main(String[] args){

        int array[] = get();

        for ( int i : array) {

            System.out.println(i +" ");
        }

    }
    
}
