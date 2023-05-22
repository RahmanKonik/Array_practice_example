package Array_practice_example;

public class ArrayCopyDemo {

    public static void main(String[] args){


        String Source_file[] = {"k","o","n","i","k","R","a","h","m","a","n"};

        String Copy_file[] = new String[4];

        //system.arraycopy(), method


        System.arraycopy(Source_file, 1, Copy_file, 0, 4);

        for(String name : Copy_file){
            System.out.print(name + " ");
        }
    }
    
}
