package Array_practice_example;

import java.util.ArrayList;

import java.util.List;

class Person {

    private String name;
    private int age;

    public Person ( String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName (){
        return name;
    }

    public int getAge (){
        return age;
    }

}

public class ArrayListObjectExample {

    public static void main(String[] args) {

        // create an arraylist to store a list of person object
        
        List<Person> people = new ArrayList<Person>();

        // adding the person object in the list

        people.add(new Person("AAAAA", 10));
        people.add(new Person("BBBBB", 20));

        // printing the list

        System.out.println("The list is :");

        people.forEach((person) -> System.out.print(person.getName() + "-"+ person.getAge()));

      
    }
    
}
