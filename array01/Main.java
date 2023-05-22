public class Main {

    public static void main(String[] args){

        TestReturn testReturn = new TestReturn();

        int array[] = testReturn.get();

        for ( int j : array) {
            System.out.println(j +" ");
        }
    }
    
}
