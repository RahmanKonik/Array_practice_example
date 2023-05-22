
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Person {

    private String name;
    private int age;

    // constructor

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    //get method

    public String getName (){
        return name;
    }

    public int getAge(){

        return age;
    }

    public void fruit(){

        String[] fruit = {"Mango", "Apple", "Pear"};

        for ( int i =0; i < fruit.length; i++) {
            System.out.print(fruit[i]+" "); 
        }

    }

}

public class Workshop1 {

    public static void main(String[] agrs) {

        Person person = new Person(null, 0);

        person.fruit();

        System.out.println();

        String[] Fruits = {"Mango", "Banana","Apple"};

        for ( int i = 0; i < Fruits.length; i++){
            System.out.print(Fruits[i] +" ");
        }


        List<String> fruitList = new ArrayList<String>();

        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Lemon");
        fruitList.add("Apple");
        fruitList.add("Pear");
        fruitList.add("organe");
        fruitList.remove("Mango");
        boolean answer = fruitList.contains("Mango");
        System.out.println();

        System.out.println("checking the list: "+ answer);

        System.out.println(fruitList);

        // size() method

        int fruit_size = fruitList.size();

        System.out.println("The size of list: "+ fruit_size);

        //indexof() method

        System.out.println("Index number :"+ fruitList.indexOf("Apple"));

        // forEach in fruitsList

        fruitList.forEach((name) ->  System.out.println(name));

        //Iterarator() method

        Iterator<String> itr = fruitList.iterator();

        while (itr.hasNext()) {
            String i = itr.next();

            System.out.print(i + " ");
        }
        System.out.println();

        // clear() method

        fruitList.clear();

        System.out.println("the list is :"+ fruitList);









        
    }
}