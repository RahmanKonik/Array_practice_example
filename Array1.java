package Array_practice_example;

public class Array1{
    public static void main(String[] args) {

        int[] myArray; // declare the array variable name

        myArray = new int[10]; // input the index number of that array

        // set the value of these index

        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        myArray[5] = 600;
        myArray[6] = 700;

        // printing the these array

        System.out.println("Index -1 :"+ myArray[0]);
        System.out.println("Index -2 :"+ myArray[1]);
        System.out.println("Index -3 :"+ myArray[2]);
        System.out.println("Index -4 :"+ myArray[4]);
        System.out.println("Index -5 :"+ myArray[5]);
        System.out.println("Index -6 :"+ myArray[3]);
        System.out.println("Index -7 :"+ myArray[6]);

        for ( int i = 0; i < myArray.length; i++){
            System.out.println("Index number ."+ i+ ":"+ myArray[i]);
        }

        // second declaration method

        int newArray[] ={100, 200, 300, 400, 5, 6, 7,8};

        for ( int i = 0; i < newArray.length; i++){
            System.out.println("Index - "+ i+ ":"+ newArray[i]);
        }

        // printing the specific index number in array

        System.out.println(newArray[0]);
    
        
    }
}