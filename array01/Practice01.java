
public class Practice01 {
    public static void main(String[] args) {


        int[] number_car = {1, 2, 3, 4};
        System.out.println(number_car[1]);

        String[] name = {"volvo", "toyta", "tesla"};
        //System.out.println(name[0]);
        for ( int i =0; i < name.length;i++){
            System.out.print(name[i] +" ");
        }
        System.out.println( );

        name[1] = "Flash";

        for ( int i =0; i < name.length;i++){
            System.out.print(name[i] + " ");
        }

        System.out.println( );

        // forEach loop 

        for(int i: number_car){
            System.out.print(i +" ");
        }

        System.out.println( );

        for(String i : name){
             System.out.print(i+ " ");
        }

        System.out.println( );

        // 2nd dimensional array

        int[][] value = {{1,2,3,4},{5,6,7}};

        System.out.println(value[1][1]);

        for ( int i =0; i< value.length;i++){
            for ( int j =0; j< value[i].length;j++){
                System.out.print(value[i][j]+" ");
            }
        }

        System.out.println( );

        value[1][1] = 9;

        for ( int i =0; i< value.length;i++){
            for ( int j =0; j< value[i].length;j++){
                System.out.print(value[i][j]+" ");
            }
        }

        
    }
    
}