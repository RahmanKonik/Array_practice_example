package Array_practice_example;

// list package in array list

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        // create a ArrayList  to store a list of array

        List<Integer> myList = new ArrayList<Integer>();

        // added some of number in list

        myList.add(10);// add(integer) method is added a specific number in the endof the list
        myList.add(20);
        myList.add(30);
        myList.add(40);

        //printing the list value

        System.out.println("my list value is: "+ myList);

        // add( index number , value) method is specific position and a specific value added in the list

        myList.add(0, 11);// added in beginning of the list

        System.out.println("2nd list : "+myList);


        // removing a value from the list

        myList.remove(2);

        System.out.println("3rd updated list : "+ myList);

        // print a specific index number from list by using the get method

        System.out.println("The index value is "+ myList.get(1));

        // checking a specific value has in list and print it
        // contain method give the boolean result likes. true or false

        System.out.println(" The value check in list :"+ myList.contains(40));

        //knowing the size of the list

        System.out.println("The size of list is :"+ myList.size());

        // printing the list

        System.out.println("The list is :");
        myList.forEach((num) -> System.out.print(num + " "));


        
    }
    
}
